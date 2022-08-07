package com.in28minutes.springboot.web.springbootfirstwebapplication.loginService;


import org.springframework.stereotype.Component;

//import com.in28minutes.springboot.web.springbootfirstwebapplication.Database.DataBase;

//annotation to target of my bean this is my bean
@Component
public class LoginService {
	

	public boolean Validation(String userName,String Password)  {
		System.out.println(userName + " " + Password);
		return userName.equalsIgnoreCase("Shaddu") && Password.equalsIgnoreCase("Shaddu");
	}
	
	public String Name(String n) {
		
		return n;
	}
	
	

}
