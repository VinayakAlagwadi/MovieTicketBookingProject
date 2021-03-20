package com.ltts.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.project.Dao.MovieDao;
import com.ltts.project.Dao.ScreenDao;
import com.ltts.project.model.Movie;
import com.ltts.project.model.Screen;
@SessionAttributes({ "userName" })

@RestController
public class ScreenController {

	@Autowired
	ScreenDao sod;
	
	@RequestMapping(value="addscreen", method=RequestMethod.POST)
	public ModelAndView addScreen(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		int sId=Integer.parseInt(req.getParameter("Sid"));
		String SName=req.getParameter("sname");
		String stime=req.getParameter("Stime");
		
		Movie mid = new Movie();
	    mid.setMovieId(Integer.parseInt(req.getParameter("mid")));
	    
	//	Movie mid=(req.getParameter("mid"));
		
	//	ApplicationContext ac=new ClassPathXmlApplicationContext();
		Screen s=new Screen(sId,SName,stime,mid);
		System.out.println("***** INSIDE CONTROLLER ****"+s);
		boolean b=sod.InsertScreen(s);
		
		if(b==false) {
			mv=new ModelAndView("movieList");
			model.addAttribute("message","Screen Added Successfully");
		}
		else {
			String message = "New user created successfully";
			mv=new ModelAndView("error");
			model.addAttribute("msg",message );
			
		}
		return mv;
	}
}
