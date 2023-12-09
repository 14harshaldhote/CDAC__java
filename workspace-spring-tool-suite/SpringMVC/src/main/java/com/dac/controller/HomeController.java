package com.dac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("inst","softPolynomial");
		
		
		return "index";
	}
	@RequestMapping("/contact")
		public ModelAndView contact() {
			ModelAndView mv= new ModelAndView();
			mv.addObject("name","Harshal");
			mv.setViewName("contact");
			return mv;
		}
		
	}

