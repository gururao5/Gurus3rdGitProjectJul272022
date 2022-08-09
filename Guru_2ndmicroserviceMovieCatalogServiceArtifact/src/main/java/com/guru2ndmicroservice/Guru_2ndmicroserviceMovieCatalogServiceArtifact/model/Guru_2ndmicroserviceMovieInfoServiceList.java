package com.guru2ndmicroservice.Guru_2ndmicroserviceMovieCatalogServiceArtifact.model;

import java.util.List;

public class Guru_2ndmicroserviceMovieInfoServiceList {

	private List<Guru_2ndmicroserviceMovieInfoService> movieinfoserviceList;

	public Guru_2ndmicroserviceMovieInfoServiceList(List<Guru_2ndmicroserviceMovieInfoService> movieinfoserviceList) {
		super();
		this.movieinfoserviceList = movieinfoserviceList;
	}

	public Guru_2ndmicroserviceMovieInfoServiceList()	{
		
	}
	
	public List<Guru_2ndmicroserviceMovieInfoService> getMovieinfoserviceList() {
		return movieinfoserviceList;
	}

	public void setMovieinfoserviceList(List<Guru_2ndmicroserviceMovieInfoService> movieinfoserviceList) {
		this.movieinfoserviceList = movieinfoserviceList;
	}
	
}
