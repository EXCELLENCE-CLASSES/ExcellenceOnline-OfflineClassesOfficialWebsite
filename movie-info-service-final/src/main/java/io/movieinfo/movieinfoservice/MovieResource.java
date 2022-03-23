package io.movieinfo.movieinfoservice;





import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class MovieResource {
	
	
	@RequestMapping("/movie/{id}")
	public  Movie getMovie(@PathVariable("id") String id)
	{
		return new Movie("Titanic",id);
		
		
		
	}
	
	
	
	
	
	

}
