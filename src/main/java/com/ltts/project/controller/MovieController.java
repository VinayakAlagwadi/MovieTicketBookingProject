package com.ltts.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.project.Dao.MovieDao;
import com.ltts.project.model.Movie;

@SessionAttributes({ "userName" })

@RestController
public class MovieController {
	@Autowired
	MovieDao mod;
	
	@RequestMapping(value="addmovie", method=RequestMethod.POST)
	public ModelAndView addMovie(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		int MovieId=Integer.parseInt(req.getParameter("Mid"));
		String UName=req.getParameter("uname");
		String Cast=req.getParameter("cast");
		String rDate=req.getParameter("Rdate");
		int mprice = Integer.parseInt(req.getParameter("price"));
	//	ApplicationContext ac=new ClassPathXmlApplicationContext();
		Movie m=new Movie(MovieId,UName,Cast,rDate,mprice);
		System.out.println("***** INSIDE CONTROLLER ****"+m);
		boolean b=mod.InsertMovie(m);
		
		if(b==true) {
			mv=new ModelAndView("screens");
			model.addAttribute("message","Movie Addes Successfully");
		}
		else {
			String message = "New user created successfully";
			mv=new ModelAndView("screens");
			model.addAttribute("msg",message );
			
		}
		return mv;
	}
}
