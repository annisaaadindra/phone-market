package com.phonemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/brand")

public class BrandController {
	@GetMapping
	public String kategori()
	{
		//by number
		return "brand";
	}
}
