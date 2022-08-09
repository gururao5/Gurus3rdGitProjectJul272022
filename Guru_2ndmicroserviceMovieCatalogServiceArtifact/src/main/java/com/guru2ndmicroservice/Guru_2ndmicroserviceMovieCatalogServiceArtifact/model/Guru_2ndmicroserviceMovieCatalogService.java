package com.guru2ndmicroservice.Guru_2ndmicroserviceMovieCatalogServiceArtifact.model;

public class Guru_2ndmicroserviceMovieCatalogService {

	private Integer userId;
	private String userName;
	private String movieName;
	private Integer movieRating;
	public Guru_2ndmicroserviceMovieCatalogService(Integer userId, String userName, String movieName,
			Integer movieRating) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.movieName = movieName;
		this.movieRating = movieRating;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(Integer movieRating) {
		this.movieRating = movieRating;
	}
	@Override
	public String toString() {
		return "Guru_2ndmicroserviceMovieCatalogService [userId=" + userId + ", userName=" + userName + ", movieName="
				+ movieName + ", movieRating=" + movieRating + "]";
	}
	
	
	
}
