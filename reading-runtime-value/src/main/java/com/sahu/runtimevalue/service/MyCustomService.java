package com.sahu.runtimevalue.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyCustomService {

	@Value("${projectName}")
	private String projectName;
	
	public void printProjectName() {
		System.out.println("Project Name "+projectName);
		
	}
	
}
