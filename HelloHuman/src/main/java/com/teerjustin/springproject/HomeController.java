package com.teerjustin.springproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class HomeController {
	
    @RequestMapping("/")
    public String index(@RequestParam(value="q", required=false) String searchQuery) {
    	System.out.println(searchQuery);
    	if (searchQuery != null) {
    		return "<h2>Hello " + searchQuery + " </h2><br> Welcome to SpringBoot </br>";
    	}
    	
    	return "<h2>Hello Human</h2><br> Welcome to SpringBoot </br>";
         
    }
    
    
}
