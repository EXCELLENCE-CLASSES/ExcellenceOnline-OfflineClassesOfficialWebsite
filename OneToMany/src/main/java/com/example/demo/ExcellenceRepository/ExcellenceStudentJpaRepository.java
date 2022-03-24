package com.example.demo.ExcellenceRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ExcellenceStudentModel;

@Repository
public interface ExcellenceStudentJpaRepository extends JpaRepository<ExcellenceStudentModel,Integer> {

	
	
	
}
