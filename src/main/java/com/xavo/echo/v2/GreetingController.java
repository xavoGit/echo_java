package com.xavo.echo.v2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@Value("${app.message}")
	String message = "From code";
	
	@GetMapping("/greetingv2")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", message + name);
		return "greeting";
	}

}