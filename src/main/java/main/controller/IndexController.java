package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import main.entity.Users;
import main.repositories.UserDataRepository;

@Controller
public class IndexController {

	@Autowired
	UserDataRepository repository;

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
		Iterable<Users> list = repository.findAll();
		model.addAttribute("results", list);
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