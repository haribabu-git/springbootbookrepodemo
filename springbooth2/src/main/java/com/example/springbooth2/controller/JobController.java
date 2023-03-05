package com.example.springbooth2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class JobController {
    /*@Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;*/

/*    @RequestMapping("/calljob")
    public void importCscToDb(){
        JobParameters jobParameter = new JobParametersBuilder()
                .addLong("startAt",System.currentTimeMillis()).toJobParameters();

        try {
            jobLauncher.run(job,jobParameter);
        } catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException e) {
            e.printStackTrace();
        }  catch (JobParametersInvalidException e) {
            e.printStackTrace();
        }

    }*/
}
