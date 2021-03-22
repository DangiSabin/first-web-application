package com.in28minutes.jee;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean isUserValid(String name,String password){
		if(name.equals("Sabin")&&password.equals("admin")){
			return true;
		}
		return false;
	}

}
