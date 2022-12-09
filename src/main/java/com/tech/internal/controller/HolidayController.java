package com.tech.internal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolidayController {
	
	@GetMapping("/isFedHoliday")
	public ResponseEntity<Boolean> isFedHoliday(@RequestParam String currDtTime){
		
		return null;
		
	}

}
