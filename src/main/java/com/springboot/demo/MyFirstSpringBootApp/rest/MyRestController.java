package com.springboot.demo.MyFirstSpringBootApp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@GetMapping("/")
	public String sayHello()
	{
		return "Hello World ! Time on the server is "+LocalDateTime.now();
	}

}
