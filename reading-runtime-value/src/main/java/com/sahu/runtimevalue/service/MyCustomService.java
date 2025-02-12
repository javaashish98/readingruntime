package com.sahu.runtimevalue.service;

import org.springframework.stereotype.Service;

@Service
public class MyCustomService {

	
	
	public void printProjectName() {
		String projectName = "ReadingRunTimeValue";
		System.out.println("Project Name "+projectName);
	}
	
}
