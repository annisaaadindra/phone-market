package com.phonemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kategori")
public class CategoryController {

	@GetMapping
	public String category()
	{
		//by number
		return "category";
	}
}
