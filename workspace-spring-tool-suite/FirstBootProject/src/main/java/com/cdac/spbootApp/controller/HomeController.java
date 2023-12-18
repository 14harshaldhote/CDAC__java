package com.cdac.spbootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/greeting")
	@ResponseBody
	public String home() {
		return "hello im spring boot";
	}

}
