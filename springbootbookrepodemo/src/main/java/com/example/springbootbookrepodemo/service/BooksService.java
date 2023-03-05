package com.example.springbootbookrepodemo.service;

import com.example.springbootbookrepodemo.model.*;
import com.example.springbootbookrepodemo.repository.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.util.*;

import java.io.*;
import java.util.*;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBooks()
    {
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }

    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
        List<Books> books = booksRepository.findAll();

        File file = ResourceUtils.getFile("classpath:employees.jrxml");
        JasperReport report = JasperCompileManager.compileReport(file.getAbsolutePath());

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(books);

        Map<String,Object> parameters = new HashMap<>();
        parameters.put("created By","Hari copied from Java Techie");

        JasperPrint print = JasperFillManager.fillReport(report,parameters,dataSource);

        JasperExportManager.exportReportToPdfFile(print,"D:\\PracticeDownloads\\springbootbookrepodemo\\src\\main\\resources\\employees.pdf");

        return "D:\\PracticeDownloads\\springbootbookrepodemo\\src\\main\\resources\\employees.pdf generated";
    }

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Books books)
    {
        booksRepository.save(books);
    }
}
