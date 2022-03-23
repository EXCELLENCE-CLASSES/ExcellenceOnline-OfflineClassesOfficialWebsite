package io.excellence.moviecatalogservice;


import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("get")
public class MovieCatalogResource 
{
	
	@Autowired
	public RestTemplate rt;
	
	
	@RequestMapping("catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
		{
		
		
		
		
		List<Rating> ratingList= Arrays.asList(

				new Rating("def",5),
				new Rating("abc",4)
				
				);
		
		return ratingList.stream().map(rating ->
		{
			System.out.println("hello");
		
	Movie mov=rt.getForObject("http://localhost:8081/get/movie/"+rating.getMovieId(), Movie.class);
		
		return new CatalogItem(mov.getMovieName(),"Romance",rating.getRating());
		
		
		
		}       ).collect(Collectors.toList());
		
		//Get All Related MovieIds
		
		//Get For each movieId call info service and get details
		
		//put them all together 
		
		
		
		
		
	}}
	
	
	
	
	
	


