package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("support")
@Controller
public class SupportController {
	@GetMapping("/bug-report_main")
	public void bug_report(){
		
	}
	@GetMapping("/bug-report_popUp")
	public void bug_report_popUp(){
		
	}
	
}
