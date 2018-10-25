package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.serviceInterface.ServiceInterface;

@Controller
public class HomeController {

ServiceInterface service;
@RequestMapping("/")
public String welcome()

{
	System.out.println("In / mapping ");
	return "Login";
}
}
