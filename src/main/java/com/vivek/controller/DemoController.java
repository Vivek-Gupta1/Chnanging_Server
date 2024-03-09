package com.vivek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	
	@GetMapping("/")
	public String welCome(Model model) {
		model.addAttribute("msg", "Hello Boss Good Morning");
		return "index";
		
	}
}
