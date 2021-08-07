package com.example.demo.blogics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/hello")
@RestController
public class HelloRestController {
	
	@GetMapping(value = "")
	public String HelloWorld() {
		return "Hello, World";
	}

}
