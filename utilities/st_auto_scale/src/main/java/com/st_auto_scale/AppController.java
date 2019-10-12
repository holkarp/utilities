package com.st_auto_scale;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home(@RequestParam(required=true) int countValue) {
    	System.out.println("Enter the application, sleeping for 60 secods...." + new Date());
    	try {
    		//sleep 60 seconds
    	    //Thread.sleep(60000);
    	    int cnt =1;
    	    for(;cnt<countValue;cnt++)
    	    {
    	    	System.out.println("Random no: " + Math.random());
    	    }
        	System.out.println("After delay " + new Date());
            
    	} 
    	catch(Exception e) {
    		System.out.println("Errpr : " + e.getMessage());
    	}
    	return "Hello Docker World";
    }
}
