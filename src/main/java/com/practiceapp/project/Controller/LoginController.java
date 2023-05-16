package com.practiceapp.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	//get login page
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	
	
}
