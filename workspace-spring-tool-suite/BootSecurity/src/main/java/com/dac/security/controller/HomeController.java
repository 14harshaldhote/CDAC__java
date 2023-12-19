package com.dac.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	
	@GetMapping("/admin")
	public ResponseEntity<String> admin(){
		return ResponseEntity.ok("Yes , Im Admin");
	}
	
	@GetMapping("/normal")
	public ResponseEntity<String> normal(){
		return ResponseEntity.ok("Yes , Im Normal User");
	}
	@GetMapping("/publics")
	public ResponseEntity<String> publics(){
		return ResponseEntity.ok("Yes , Im any Publics");
	}
}
