package com.code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	// create a controller method for the initialize of the html form
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	// create a controller method for the processing of the html form
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	// create a controller method that read form data and add data to the model
	@RequestMapping("/processFormTwo")
	public String letsShoutDude(HttpServletRequest request, Model model){
		// read request params data from the html form
		String theName = request.getParameter("studentName");
		
		// convert the data to upcase
		theName = theName.toUpperCase();
		
		// create a message
		String result = "Yo! " + theName;
		
		// store data into our model
		model.addAttribute("message", result);
	
		return "helloworld";
	}
		
		// create a controller method that read form data and add data to the model
		@RequestMapping("/processFormThree")
		public String processFormThree(@RequestParam("studentName") String theName, Model model){
			
			// convert the data to upcase
			theName = theName.toUpperCase();
			
			// create a message
			String result = "Hey Dude! " + theName;
			
			// store data into our model
			model.addAttribute("message", result);
		
		return "helloworld";
	}

}
