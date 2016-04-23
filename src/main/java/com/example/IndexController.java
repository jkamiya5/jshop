package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("/info")
	public String info(Model model) {
		return "info";
	}
	
	@RequestMapping("/shopping")
	public String shopping(Model model) {
		return "shopping";
	}

}