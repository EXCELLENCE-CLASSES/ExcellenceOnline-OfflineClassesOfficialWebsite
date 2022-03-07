package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@FunctionalInterface
interface Interf
{
   public void method1(int k);	
}
@SpringBootApplication
public class FibonacciSeries {
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(FibonacciSeries.class, args);
		
	
		
		Interf i= k->{		
			            int n1=0,n2=1,n3 ;
		                  System.out.println(n1);
		                  System.out.println(n2);
			
		         for(int p=3;p<=k;p++) 
			     {
				  n3=n1+n2;
				  System.out.println(n3);
				  n1=n2;
				  n2=n3;
			      }
		               };
		i.method1(10);
		
		
		
	}
	
	}

