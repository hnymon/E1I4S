package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("rank")
@Controller
public class RankController {
	@GetMapping("/rank")
	public void rank() {
	} 
}
