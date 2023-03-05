package com.example.oggingdemo;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Logger logger = LoggerFactory.getLogger(DemoApplication.class);
		logger.warn("this is warn message");
		logger.info("this is infomessage");

			System.out.println(10/0);



	}

}
