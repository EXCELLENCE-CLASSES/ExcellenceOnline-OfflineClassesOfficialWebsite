package com.excellence.OnlineOfficialWebsite.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.excellence.OnlineOfficialWebsite.model.ExcellenceClassesDetails;
import com.excellence.OnlineOfficialWebsite.model.ExcellenceStudentDetails;
import com.excellence.OnlineOfficialWebsite.repository.ExcellenceClassesDetailsRepository;
import com.excellence.OnlineOfficialWebsite.repository.ExcellenceStudentDetailsRepository;
import com.excellence.OnlineOfficialWebsite.repository.ExcellenceTeacherDetailsRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@RestController
public class ExcellenceController {
	
	@Autowired
	ExcellenceClassesDetailsRepository excRepo ;
	
	@Autowired
	ExcellenceStudentDetailsRepository excStuRepo ;
	
	@Autowired
	ExcellenceTeacherDetailsRepository excTchRepo ;
	
	@PostMapping("/saveExcellence")
	public void saveExcellenceClasses(@RequestBody ExcellenceClassesDetails excServ )
	{
		System.out.println("hello");
		System.out.println(excServ);
		excRepo.save(excServ);
		
		
	}
	@RequestMapping("/abc")	
	public ModelAndView registrationPage(Model model) 
	{
		ExcellenceStudentDetails exc=new ExcellenceStudentDetails();
		model.addAttribute("abc", exc);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("registration.html");
		
		return mv;
	}
	
	@RequestMapping(value="register") 
	public ModelAndView registrationForm(@ModelAttribute("exc") ExcellenceStudentDetails exc) 
	{
		excStuRepo.save(exc);
		
		System.out.println(exc);
		  
		System.out.println("Executing here");
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.html");
		return mv ;		
		
		
	}
	
	@RequestMapping("contactUs")	
	public ModelAndView aboutUs(Model model) 
	{
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("contactUs.html");
		
		return mv;
	}
	
	
	@RequestMapping("aboutUs")	
	public ModelAndView contactUs(Model model) 
	{
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("aboutUs.html");
		
		return mv;
	}
	
	
	
	
	

	

}
