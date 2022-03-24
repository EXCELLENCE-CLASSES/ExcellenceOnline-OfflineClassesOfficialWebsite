package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="exc_stu_model")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcellenceStudentModel {
	
	@Id
	@GeneratedValue
	private int excellenceStudentId ;
	
	
	private String excellenceStudentName ;
	//One to one bidirectional 
	//note:Not required @JoinColumn ,because "excModel" reference Of ExcellenceClasses Model defined in ExcellenceClasses Model is already using mappedBy. 
	//In One-To-One Bidirectional Shared primary key mapping, two tables share the same primary key. The Bidirectional relationship means navigation is possible in both direction.
	@OneToOne(cascade=CascadeType.ALL,mappedBy="excModel")
	private ExcellenceClassesModel model ;
	

}
