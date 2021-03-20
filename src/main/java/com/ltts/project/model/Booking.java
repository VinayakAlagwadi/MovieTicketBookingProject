package com.ltts.project.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int movieid;
	
	private int bookedSeats;
	private String date;
	private String time;
	

	
	@ManyToOne
	private Movie movie;
	@ManyToOne
	private Screen screen;
	@ManyToOne
	@JoinColumn(name="email")
	private Member user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public Member getUser() {
		return user;
	}
	public void setUser(Member user) {
		this.user = user;
	}
	
	
	
	
	
	
	public Booking(int id, int movieid, int bookedSeats, String date, String time, Movie movie, Screen screen,
			Member user) {
		super();
		this.id = id;
		this.movieid = movieid;
		this.bookedSeats = bookedSeats;
		this.date = date;
		this.time = time;
		this.movie = movie;
		this.screen = screen;
		this.user = user;
	}
	public Booking() {
		super();
	}
	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", movieid=" + movieid + ", bookedSeats=" + bookedSeats + ", date=" + date
				+ ", time=" + time + ", movie=" + movie + ", screen=" + screen + ", user=" + user + "]";
	}
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	
	
	
	
}
