package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="exc_stu_model")
@Getter
@Setter
//Getter and Setter is preferable the @Data because of Circular Dependency may caused by two different Beans ie. Injecting two beans at same time . 
@AllArgsConstructor
@NoArgsConstructor
public class ExcellenceStudentModel {
	
	@Id	
	private int excellenceStudentId ;
	
	
	private String excellenceStudentName ;
	//One to one bidirectional 
	//note:Not required @JoinColumn ,because "excModel" reference Of ExcellenceClasses Model defined in ExcellenceClasses Model is already using mappedBy. 
	//In One-To-One Bidirectional Shared primary key mapping, two tables share the same primary key. The Bidirectional relationship means navigation is possible in both direction.
    
	/*	@OneToOne(cascade=CascadeType.ALL,mappedBy="excModel")
	private ExcellenceClassesModel model ; */
	//we are using alternative for joining two entity in ExcellenceClassesModelEntity .
	         
	         @ManyToOne(cascade=CascadeType.ALL)
	         @JoinColumn(name="ex_id")
             private ExcellenceClassesModel exc ;
	
	
	
}
