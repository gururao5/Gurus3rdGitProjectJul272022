package com.guru2ndmicroservice.Guru_2ndmicroserviceMovieInfoServiceArtifact.springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Guru_2ndmicroservicemovieinfoController {

	@RequestMapping("/guru_2ndmicrosservicewelcome")
	public String returnWelcomePage()
	{
		return "guru_2ndmicroservicemovieinfo_welcome.jsp";
	}
}
