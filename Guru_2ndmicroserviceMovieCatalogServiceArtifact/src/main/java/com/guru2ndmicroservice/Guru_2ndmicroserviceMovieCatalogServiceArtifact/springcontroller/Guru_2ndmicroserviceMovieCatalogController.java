package com.guru2ndmicroservice.Guru_2ndmicroserviceMovieCatalogServiceArtifact.springcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.guru2ndmicroservice.Guru_2ndmicroserviceMovieCatalogServiceArtifact.model.Guru_2ndmicroserviceMovieCatalogService;
import com.guru2ndmicroservice.Guru_2ndmicroserviceMovieCatalogServiceArtifact.model.Guru_2ndmicroserviceMovieInfoService;
import com.guru2ndmicroservice.Guru_2ndmicroserviceMovieCatalogServiceArtifact.model.Guru_2ndmicroserviceMovieInfoServiceList;

@Controller
//@RequestMapping("/MovieCatalog")
public class Guru_2ndmicroserviceMovieCatalogController {
	
	@Autowired
	RestTemplate resttempobj;
	@RequestMapping("/MovieCatalogwelcomepage")
	public String movieCatalogWelcomepage()
	{
		return "movieCatalogWelcome.jsp";
	}


@RequestMapping("/MovieCatalog/movieratings/{userid}")
@ResponseBody
public List<Guru_2ndmicroserviceMovieCatalogService> getMovieCatalogMovieInfo(@PathVariable("userid") Integer userIdVal)
{
//	RestTemplate resttempobj=new RestTemplate();
	List<Guru_2ndmicroserviceMovieCatalogService> listofmoviecatalogitems=new ArrayList<Guru_2ndmicroserviceMovieCatalogService>();
	Guru_2ndmicroserviceMovieInfoServiceList movieinfolistobj=  resttempobj.getForObject("http://localhost:8082/guru_2ndmicroserviceinfo/" + userIdVal, Guru_2ndmicroserviceMovieInfoServiceList.class);
	for( Guru_2ndmicroserviceMovieInfoService movieinfoobj:		movieinfolistobj.getMovieinfoserviceList())
	{
		String moviename=movieinfoobj.getMovieDescription();
		Integer movierating=movieinfoobj.getMovieRating();
		Guru_2ndmicroserviceMovieCatalogService localcatalogobj=new Guru_2ndmicroserviceMovieCatalogService(userIdVal,"Sam Neil",moviename,movierating);
		listofmoviecatalogitems.add(localcatalogobj);
	}
	
	return listofmoviecatalogitems;
}
}