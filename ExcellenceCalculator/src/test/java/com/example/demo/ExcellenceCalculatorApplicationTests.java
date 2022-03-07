package com.example.demo;



import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.calculator.Calculator;

@SpringBootTest
class ExcellenceCalculatorApplicationTests {

	@Test
	void contextLoads() {
		Calculator c1=new Calculator();
	String result=	c1.concatenateString("Ritesh Ranjan"," Arya");
	String expected ="Ritesh Ranjan Arya";
	//assertThat(result).isEqualTo(expected);
	
	
	
	}
	
	
	
	
	}




