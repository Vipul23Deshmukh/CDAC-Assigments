package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String sayHello()
	{
		return "hello";
	}
	
	
	@GetMapping("/welcome")
	public ModelAndView sayWelcome() {
		String msg="welcome to iet from controller";
		return new ModelAndView("welcome","message",msg);
	}
	
	@GetMapping("/test")
	public String testData(Model mymodel)
	{
		mymodel.addAttribute("name","tushar");
		mymodel.addAttribute("email", "sspatil@gmail.com");
		return "testdata";
		
	}
}
