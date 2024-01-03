package com.testingSecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestControler {
	
	@GetMapping("/normal")
	public ResponseEntity<String> normalU(){
		return ResponseEntity.ok("heyy im the normal user");
	}
	
	@GetMapping("/public")
	public ResponseEntity<String> publicU(){
		return ResponseEntity.ok("hello im the public user");
		
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> adminU(){
		return ResponseEntity.ok("hello teh admin of this orgggg.");
	}

}