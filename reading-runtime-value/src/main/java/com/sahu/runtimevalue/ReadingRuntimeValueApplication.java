package com.sahu.runtimevalue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sahu.runtimevalue.service.MyCustomService;

@SpringBootApplication
public class ReadingRuntimeValueApplication {

	public static void main(String[] args) {
		
		MyCustomService service = new MyCustomService();
		
		
		SpringApplication.run(ReadingRuntimeValueApplication.class, args);
		
		service.printProjectName();
	}

}
