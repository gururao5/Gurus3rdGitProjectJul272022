package com.guru2ndmicroservice.Guru_2ndmicroserviceMovieInfoServiceArtifact.model;

public class Guru_2ndmicroserviceMovieInfoService {
	
	private Integer userId;
	private String movieDescription;
	private Integer movieRating;
	public Guru_2ndmicroserviceMovieInfoService(Integer userId, String movieDescription, Integer movieRating) {
		super();
		this.userId = userId;
		this.movieDescription = movieDescription;
		this.movieRating = movieRating;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	public Integer getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(Integer movieRating) {
		this.movieRating = movieRating;
	}
	@Override
	public String toString() {
		return "Guru_2ndmicroserviceMovieInfoService [userId=" + userId + ", movieDescription=" + movieDescription
				+ ", movieRating=" + movieRating + "]";
	}
	

}
