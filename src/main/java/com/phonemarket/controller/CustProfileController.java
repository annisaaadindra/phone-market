package com.phonemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profil")
public class CustProfileController {
	@GetMapping()
	public String showProfile() {
		return "customerProfile";
	}
	
	@PostMapping()
	public String save()
	{
		return "customerProfile";
	}
}
