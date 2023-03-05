package com.example.springbooth2.config;


import com.example.springbooth2.model.*;
import com.example.springbooth2.repository.*;
import org.springframework.batch.core.*;
import org.springframework.batch.core.configuration.annotation.*;
import org.springframework.batch.item.data.*;
import org.springframework.batch.item.file.*;
import org.springframework.batch.item.file.mapping.*;
import org.springframework.batch.item.file.transform.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.core.io.*;
import org.springframework.stereotype.*;

@Component
@EnableBatchProcessing
public class EmployeeBatchConfig {

    /*@Autowired
    public void setJobBuilderFactory(JobBuilderFactory jobBuilderFactory) {
        this.jobBuilderFactory = jobBuilderFactory;
    }
    @Autowired
    public void setStepBuilderFactory(StepBuilderFactory stepBuilderFactory) {
        this.stepBuilderFactory = stepBuilderFactory;
    }*/
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;  //

    @Autowired
    private EmployeeRepository employeeRepository;




    @Bean
    public FlatFileItemReader<Employee> reader(){
        FlatFileItemReader<Employee> reader = new FlatFileItemReader<>();
        reader.setLinesToSkip(1);
        reader.setName("csvreader");
        reader.setResource(new ClassPathResource("data.csv"));
        reader.setLineMapper(lineMapper());

        return reader;
    }
    @Bean
    private LineMapper<Employee> lineMapper(){
        DefaultLineMapper<Employee> defaultLineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(",");
        lineTokenizer.setNames("id","name","deptName");
        lineTokenizer.setStrict(false);

        BeanWrapperFieldSetMapper<Employee> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(Employee.class);

        defaultLineMapper.setLineTokenizer(lineTokenizer);
        defaultLineMapper.setFieldSetMapper(fieldSetMapper);


        return defaultLineMapper;
    }

    @Bean
    public EmployeeItemProcessor employeeItemProcessor(){
        return new EmployeeItemProcessor();
    }
    @Bean
    public RepositoryItemWriter<Employee> writer(){
        //JdbcBatchWriter also available
        RepositoryItemWriter<Employee> writer = new RepositoryItemWriter<>();
        writer.setRepository(employeeRepository);
        writer.setMethodName("save");

        return writer;
    }

    @Bean
    public Step step1(){
        return stepBuilderFactory.get("csv-get").<Employee,Employee>chunk(3)
                                 .reader(reader()).processor(employeeItemProcessor())
                .writer(writer()).build();
    }
    @Bean
    public Job runjob(){
        return jobBuilderFactory.get("importEmployees")
                .flow(step1()).end().build();
    }
}
