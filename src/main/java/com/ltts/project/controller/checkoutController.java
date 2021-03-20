package com.ltts.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.project.Dao.CheckoutDao;
import com.ltts.project.Dao.MovieDao;
import com.ltts.project.model.Checkout;
import com.ltts.project.model.Movie;

public class checkoutController {

	
	@Autowired
	CheckoutDao cod;
	
	@RequestMapping(value="/complete", method=RequestMethod.POST)
	public ModelAndView addcheck(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		String FName=req.getParameter("firstname");
		String Email=req.getParameter("email");
		String UName=req.getParameter("address");
		String city=req.getParameter("city");
		int Zip = Integer.parseInt(req.getParameter("zip"));
		String Cname=req.getParameter("cardname");
		int Cnumber = Integer.parseInt(req.getParameter("cardnumber"));
		int month = Integer.parseInt(req.getParameter("expmonth"));
		int year = Integer.parseInt(req.getParameter("expyear"));
		int CVV = Integer.parseInt(req.getParameter("cvv"));
		int Total = Integer.parseInt(req.getParameter("total"));
	//	ApplicationContext ac=new ClassPathXmlApplicationContext();
		Checkout m=new Checkout(FName,Email,UName,city,Zip,Cname,Cnumber,month,year,CVV,Total);
		System.out.println("***** INSIDE CONTROLLER ****"+m);
		boolean b=cod.InsertCheck(m);
		
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
