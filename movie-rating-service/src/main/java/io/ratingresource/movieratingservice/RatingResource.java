package io.ratingresource.movieratingservice;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class RatingResource {
	
	
	@RequestMapping("/rating/{movieId}")
	public List<Rating> getRating(@PathVariable("movieId") String id )
	{
		
		return Collections.singletonList(new Rating(id,6));
		
	}
	
	
	
	
	

}
