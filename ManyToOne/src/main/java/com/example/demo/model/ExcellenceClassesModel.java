package com.example.demo.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="exc_cls_model")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExcellenceClassesModel {
	
	@Id	
	int excellenceId ;
	
	
	String excellenceName;
	
   //  @OneToOne(cascade=CascadeType.ALL)
/*	@JoinColumn(name="F_K") */
	//We are using alternative methods for joining column using @JoinTable Annotation.
/*	@JoinTable(name="Excellence_Student",joinColumns= {@JoinColumn(name="excellence_id")},
	inverseJoinColumns={@JoinColumn(name="student_id")})*/
     
     //@OneToMany Mapping Annotation Test
	
    @OneToMany(cascade=CascadeType.ALL,mappedBy="exc")
  //   @JoinColumn(name="exce_id")
	
	private List<ExcellenceStudentModel> excModel=new LinkedList<>(); 
     
     
	
	
	
	

}
