package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String indexDirect(Model model) {
		return "index";
	}
	
	@RequestMapping("/index")
	public String indexMenubar(Model model) {
		return "index";
	}

	@RequestMapping("/info")
	public String info(Model model) {
		return "info";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@RequestMapping("/shopping")
	public String shopping(Model model) {
		return "shopping";
	}

	@RequestMapping("/soldout")
	public String soldout(Model model) {
		return "soldout";
	}

	@RequestMapping("/access")
	public String access(Model model) {
		return "access";
	}

	@RequestMapping("/link")
	public String link(Model model) {
		return "link";
	}

}