/**
 * 
 */
package com.example.demo;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author CC
 *
 */
public class DemoMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Object, Object> response = new LinkedHashMap<Object, Object>();
		
		response.put("response", 0);
		System.out.println(response.entrySet());
		response.put("response_code", "2");
	    response.put("response_message", "Success");
	    //To pass studentAddressParams to response map
	    response.put(12, null);
	    response.put("response_code", "");
		System.out.println(response.keySet() +" " + response.values());
	}

}
