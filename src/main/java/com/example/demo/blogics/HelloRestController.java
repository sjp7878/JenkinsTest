package com.example.demo.blogics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/hello")
public class HelloRestController {
	
	@GetMapping(value = "")
	public String HelloWorld() {
		return "Hello, World!!~";
	}

}
