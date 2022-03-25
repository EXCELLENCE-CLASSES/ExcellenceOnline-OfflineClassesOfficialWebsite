package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ExcellenceService;

@RestController
@RequestMapping("/save")
public class ExcellenceController {
	
	@Autowired
	private ExcellenceService excService ;
	
	@RequestMapping("/excellence")
	public void saveExcellence() 
	{
		excService.saveExcellence();
		
		
	}

}
