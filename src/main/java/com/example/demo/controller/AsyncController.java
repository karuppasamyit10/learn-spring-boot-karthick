package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AsyncTest;

 @RestController
 public class AsyncController {
	
	@Autowired
	private AsyncTest asynctest;
	
	@GetMapping("/send")
	public String sendMessage(String msg)	
	{
		asynctest.sentTextMsg(msg);
		return "Msg sent succeccFully "+Thread.currentThread().getName();
	}
	
	@GetMapping("/display")
	public String getDisplay(String name){
		asynctest.display(name);
		return "name display successfully "+Thread.currentThread().getName();
		
	}
	

}
