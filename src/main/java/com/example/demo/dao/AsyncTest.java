package com.example.demo.dao;





import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;



   @Service
   public class AsyncTest {
	
	@Async
	public void sentTextMsg(String msg)
	{
		
	System.out.println(" sent text message " +Thread.currentThread().getName());
	
	}
	@Async
	public void display(String name){
		System.out.println("sent name ");
	}
}
