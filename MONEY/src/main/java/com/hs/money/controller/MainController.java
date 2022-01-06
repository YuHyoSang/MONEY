package com.hs.money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/test")
	public String main(Model model) {
		model.addAttribute("ddd","ddd");
		return "main/test";
	}

}
