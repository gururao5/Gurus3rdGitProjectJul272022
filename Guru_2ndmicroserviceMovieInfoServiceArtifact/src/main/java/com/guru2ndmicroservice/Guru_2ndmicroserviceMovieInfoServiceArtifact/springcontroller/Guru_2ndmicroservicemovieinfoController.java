package com.guru2ndmicroservice.Guru_2ndmicroserviceMovieInfoServiceArtifact.springcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guru2ndmicroservice.Guru_2ndmicroserviceMovieInfoServiceArtifact.model.Guru_2ndmicroserviceMovieInfoService;
import com.guru2ndmicroservice.Guru_2ndmicroserviceMovieInfoServiceArtifact.model.Guru_2ndmicroserviceMovieInfoServiceList;

@Controller
public class Guru_2ndmicroservicemovieinfoController {

	// Below method is just a test method to initially test the Springboot application works fine by displaying welcome page
	// when you pass the URL localhost:8082/guru_2ndmicrosservicewelcome
	@RequestMapping("/guru_2ndmicrosservicewelcome")
	public String returnWelcomePage()
	{
		return "guru_2ndmicroservicemovieinfo_welcome.jsp";
	}
	
	
	// Below method returns a list of Guru_2ndmicroserviceMovieInfoService Objects each member of the list containing the userid
	// that was passed to this endpoint, movie name, movie rating . Basically it behaves as if it is returning 
	// a list of movies that a passed userid watches along with the name of the movie and the rating the user gave for that movie
	// Instead of returning a List it returns the Guru_2ndmicroserviceMovieInfoServiceList object because the member of that 
	// List class itself is a list of objects of type Guru_2ndmicroserviceMovieInfoService. And returning an object of a class from a 
	// microservice is better than returning a List Kaushik mentions in video 15 of his video series on microservices.
	// http://localhost:8082/guru_2ndmicroserviceinfo/1234
	
	@RequestMapping("/guru_2ndmicroserviceinfo/{userid}")
	@ResponseBody
	public Guru_2ndmicroserviceMovieInfoServiceList getMovieDetails(@PathVariable("userid") Integer useridval)
	{
		List<Guru_2ndmicroserviceMovieInfoService>  listofmoviesforuserid=Arrays.asList(new Guru_2ndmicroserviceMovieInfoService(useridval, "Transformers",10), new  Guru_2ndmicroserviceMovieInfoService(useridval, "Jurassic Park",4));
		Guru_2ndmicroserviceMovieInfoServiceList movieinfoservicelistobj=new Guru_2ndmicroserviceMovieInfoServiceList(listofmoviesforuserid);
		return movieinfoservicelistobj;
	}
}
