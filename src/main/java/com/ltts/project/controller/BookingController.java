package com.ltts.project.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.project.Dao.BookingDao;
import com.ltts.project.Dao.MovieDao;
import com.ltts.project.model.Booking;
import com.ltts.project.model.Member;
import com.ltts.project.model.Movie;
import com.ltts.project.model.Screen;
@SessionAttributes({ "userName" })

public class BookingController {
	@Autowired
	BookingDao bod;
	
	@Autowired
	MovieDao md;
	
	
	

	private Date Date(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

}
