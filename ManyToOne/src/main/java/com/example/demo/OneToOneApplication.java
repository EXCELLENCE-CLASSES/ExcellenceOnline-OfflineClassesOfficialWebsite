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
		excClassesModel.setExcellenceId(1);
		
		
		
		ExcellenceStudentModel excStuModel2=new ExcellenceStudentModel();
		excStuModel2.setExcellenceStudentName("Son");
		excStuModel2.setExcellenceStudentId(1);
		excStuModel2.setExc(excClassesModel);
		
		
		
		ExcellenceStudentModel excStuModel3=new ExcellenceStudentModel();
		excStuModel3.setExcellenceStudentName("arya");
		
		excStuModel3.setExcellenceStudentId(2);
	
		
		
		
		
		excClassesModel.getExcModel().add(excStuModel2);
		excClassesModel.getExcModel().add(excStuModel3);
		excStuModel3.setExc(excClassesModel);
		
		
		
		 
		
		
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
