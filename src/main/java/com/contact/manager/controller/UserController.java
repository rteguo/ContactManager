package com.contact.manager.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.contact.manager.model.User;
import com.contact.manager.model.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userrep;
	
	@RequestMapping("/loginform")
	public ModelAndView getForm()
	{
		System.out.println("Login Formhere");
		return new ModelAndView("LoginUser","userobj",new User());
	}
	@RequestMapping("/loginprocess")
	public String checkUser(@ModelAttribute("userobj") User u)
	{
		User usr = null;
		usr = userrep.findByUsernameAndPassword(u.getUsername(), u.getPassword());
		if(usr != null)
		{
			return "LoginSucess";
		}
		return "UserRegister";
	}
	@RequestMapping("/UserRegister")
	public ModelAndView getRegisterForm()
	{
		System.out.println("Register Form here");
		return new ModelAndView("RegisterForm","userobj",new User());
	}
	@RequestMapping("/registerprocess")
	public ModelAndView register(@ModelAttribute("userobj") User u)
	{
		userrep.save(u);
		return new ModelAndView("LoginUser","userobj",new User());
	}
	@RequestMapping("/logoutprocess")
	public ModelAndView logout(@ModelAttribute("userobj") User u)
	{
		return new ModelAndView("LoginUser","userobj",new User());
	}
	

}
