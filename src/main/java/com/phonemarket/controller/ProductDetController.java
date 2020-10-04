package com.phonemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/detail-produk")
public class ProductDetController {
	@GetMapping
	public String show()
	{
		return "productDetail";
	}
}
