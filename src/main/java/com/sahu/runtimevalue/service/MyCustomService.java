package com.sahu.runtimevalue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sahu.runtimevalue.GstDetails;

@Service
public class MyCustomService {

	@Value("${projectName}")
	private String projectName;
	
	@Value("${foodGst}")
	private double foodGst;

	@Value("${juteGst}")
	private double juteGst;
	
	@Value("${sillkWasteGst}")
	private double sillkWasteGst;
	
	@Autowired
	private GstDetails gstDetails;
	
	
	public void printProjectName() {
		System.out.println("Project Name "+projectName);
		
		System.out.println("Food Gst "+foodGst);
		System.out.println("Jute Gst "+juteGst);
		
		System.out.println("sillkWasteGst : "+ sillkWasteGst);
		
		System.out.println("Medical GST is  : "+gstDetails.getMedical());
		
	}
	
}
