package com.sahu.runtimevalue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sahu.runtimevalue.service.MyCustomService;

@SpringBootApplication
public class ReadingRuntimeValueApplication implements ApplicationRunner{

	@Autowired
	private MyCustomService service;
	
	public static void main(String[] args) {
		SpringApplication.run(ReadingRuntimeValueApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		service.printProjectName();
	}

}
