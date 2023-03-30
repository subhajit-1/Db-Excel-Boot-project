package com.subha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootExcelExportApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =SpringApplication.run(SpringbootExcelExportApplication.class, args);
	CourseRepository  repo= ctxt.getBean(CourseRepository.class);
//		Course course=new Course();
//		course.setCid(104);
//		course.setName("SPRING ");
//		course.setPrice(1999.50);
//		
//		repo.save(course);
//
//		System.out.println("Record inserted.....");
	}

}
