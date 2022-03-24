package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ExcellenceRepository.ExcellenceJpaRepository;

import com.example.demo.model.ExcellenceClassesModel;

@Service
public class ExcellenceService {
	
	@Autowired
	private ExcellenceClassesModel excModel;
	
	@Autowired
	private ExcellenceJpaRepository excModelRepo ;
	
	
	public void saveExcellence(){
		
		excModelRepo.save(excModel);
		
		
		
		
	}

}
