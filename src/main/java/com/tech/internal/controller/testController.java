package com.tech.internal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@GetMapping("/testMapping/{str}")
	public String gettestData(@PathVariable String str) {
		
		return "Hello " + str;
		
	}

}
