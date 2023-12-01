package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("board")
@Controller
public class BoardController {
	@GetMapping("free_board")
	public void free_board() {
		
	}
	@GetMapping("tip_know-how")
	public void tip_know() {
		
	}
	@GetMapping("trading_board")
	public void trading_board() {
		
	}
}
