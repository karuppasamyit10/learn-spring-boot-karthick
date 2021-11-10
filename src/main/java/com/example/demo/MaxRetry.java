package com.example.demo;

import java.util.UUID;

public class MaxRetry {

	public static void main(String[] args) {
		 UUID emailLogId=UUID.randomUUID();  
	        int count = 1;
	        final int maxRetries = 4;
	        while ( count < maxRetries )
	        {
	            try
	            {
	                if(count>1){
	                    Thread.sleep(1000);
	                    System.out.println("{} retry sendEmail to {} emailLogId {}");
	                } else {
	                	System.out.println("sendEmail to {} emailLogId {}");
	                }
	                int a = 10, b = 0;
	                System.out.println(a/b);    
	                count = maxRetries;
	            }
	            catch (Exception e)
	            {
	                if ( ++count >= maxRetries )
	                {
	                	System.out.println("Max retries exceeded {} ");
	                }
	            }
	        }

	}

}
