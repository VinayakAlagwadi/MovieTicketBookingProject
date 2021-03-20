package com.ltts.project.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Movie implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7105783923904121474L;
	
	
	
	@Id
	private int movieId;
	private String movieName;
	private String cast;
	private String releaseDate;
	private int price;
	@OneToMany(mappedBy="movie")
	private List<Booking> booked;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<Booking> getBooked() {
		return booked;
	}
	public void setBooked(List<Booking> booked) {
		this.booked = booked;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Movie(int movieId, String movieName, String cast, String releaseDate, int price) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.cast = cast;
		this.releaseDate = releaseDate;
		this.price = price;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "[movieId=" + movieId + "]";
	}
	
	
	
}
