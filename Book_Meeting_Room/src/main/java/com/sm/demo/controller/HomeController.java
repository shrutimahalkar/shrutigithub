package com.sm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	//@ResponseBody	
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/user")
	//@ResponseBody	
	public String user()
	{
		return "User.jsp";
	}
	@RequestMapping("/Admin")
	//@ResponseBody	
	public String admin()
	{
		return "Admin.jsp";
	}

	@RequestMapping("/tl")
	//@ResponseBody	
	public String tl()
	{
		return "Tl.jsp";
	}

	@RequestMapping("/pm")
	//@ResponseBody	
	public String pm()
	{
		return "Pm.jsp";
	}

	@RequestMapping("/Register")
	public String Register()
	{
		return "Register.jsp";
	}

}
