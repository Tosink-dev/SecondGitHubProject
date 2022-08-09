package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
	
	public String test () {
		
		return "";
		return "Welcome to the PROFILE PAGE";
		
	}

}
