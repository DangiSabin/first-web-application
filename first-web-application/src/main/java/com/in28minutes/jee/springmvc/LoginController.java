package com.in28minutes.jee.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.jee.LoginService;

@Controller
public class LoginController {
	//Set LoginService - Autowiring
	@Autowired
	LoginService service;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String sayHello (){
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name,@RequestParam String password,ModelMap model){
		if(service.isUserValid(name, password)){
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}
		else{
			model.put("errorMessage","Invalid Credintials!!");
			return "login";
		}
		
	}


}
