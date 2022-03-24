package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.ExcellenceClassesModel;
import com.example.demo.model.ExcellenceStudentModel;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner{
	
	
	@Bean
	public ExcellenceClassesModel getExcellenceModel() 
	{
		ExcellenceClassesModel excClassesModel=new ExcellenceClassesModel();
		
		excClassesModel.setExcellenceName("Excellence Online&Offline Classes");
		ExcellenceStudentModel excStuModel=new ExcellenceStudentModel();
		
		excStuModel.setExcellenceStudentName("Er. Ritesh Ranjan Arya");
		excClassesModel.setExcModel(excStuModel);		
		
		return excClassesModel ;
	}

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		
		
	}

}
