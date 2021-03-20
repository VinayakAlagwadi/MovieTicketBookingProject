package com.ltts.project.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Screen implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -212103894384517480L;

	@Id
	private int screenId;
	
	private String screenName;
	private String showTime;
	
	
	 
	 // private int movieid;
	  
	  @OneToMany(mappedBy = "screen")
		private List<Booking> booked;
	  
	  @ManyToOne
		@JoinColumn(name="movieId")
		private Movie movie;

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public Movie getMovieid() {
		return movie;
	}

	public void setMovieid(Movie movieid) {
		this.movie = movieid;
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

	public Screen(int screenId, String screenName, String showTime, Movie movieid) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.showTime = showTime;
		this.movie = movieid;
	}

	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenName=" + screenName + ", showTime=" + showTime + ", movieid="
				+ movie + ", booked=" + booked + "]";
	}

	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
