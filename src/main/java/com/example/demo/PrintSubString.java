package com.example.demo;

public class PrintSubString {

	public static void main(String[] args) {
		 String str = "com.abel.vitalpacs.support.edge.log.RequestAndResponseLogFilter.";
		 	int size = str.length()<100?str.length():100;
	        System.out.println(str.substring(0, size));
	}
}
