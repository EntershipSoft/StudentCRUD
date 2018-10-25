package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.serviceInterface.ServiceInterface;



@Controller
public class HomeController {
@Autowired
ServiceInterface si;
@RequestMapping("/")
public String loginPage(){
	System.out.println("in login page");
	return "Login";
	
}
@RequestMapping("/reg")
public String RegisterPage(){
	System.out.println("in login page");
	return "Register";

}
}
