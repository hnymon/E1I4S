package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("pointshop")
@Controller
public class PointShopController {
	@GetMapping("/pointshop")
	public void pointShop() {
		
		System.out.println("하잉");
	} 
	
}
  