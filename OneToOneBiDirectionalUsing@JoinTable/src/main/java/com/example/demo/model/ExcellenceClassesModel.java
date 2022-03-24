package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="exc_cls_model")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcellenceClassesModel {
	
	@Id
	@GeneratedValue
	int excellenceId ;
	
	
	String excellenceName;
	
     @OneToOne(cascade=CascadeType.ALL)
/*	@JoinColumn(name="F_K") */
	//We are using alternative methods for joining column using @JoinTable Annotation.
	@JoinTable(name="Excellence_Student",joinColumns= {@JoinColumn(name="excellence_id")},
	inverseJoinColumns={@JoinColumn(name="student_id")})
	
	private ExcellenceStudentModel excModel;
	
	
	
	

}
