package com.paytm.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/firstMapping/")
	public String hello(){
		return "you successfully implemented hello world using spring boot.";
	}
}
