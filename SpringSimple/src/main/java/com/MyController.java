package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
public class MyController {
	
	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("Hello World");
		return "home";		
	}
	
    @RequestMapping(value = "/user" , method =  RequestMethod.GET)
    public String userpage( User mad,Model model) {
    	System.out.println(mad.getUName());
    	model.addAttribute("Uname",mad.getUName());
    	return "user";
    }
}
