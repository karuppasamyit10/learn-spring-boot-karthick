package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	

	@RequestMapping(value="/print", method = RequestMethod.GET)
	@ResponseBody
	public String print( String name) {
		return "helloworld " + name;
		
	}
	
	@RequestMapping(value="/display",method= RequestMethod.POST)
	public String display(String name){
		return "Welcome to java " + name;
		
	}
	
	@RequestMapping(value="/withpathvariable/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String withpathvariable(@PathVariable String name) {
		return "helloworld " + name;
		
	}
}
