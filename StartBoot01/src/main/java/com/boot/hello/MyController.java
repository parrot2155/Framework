package com.boot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/bye")
	public String bye() {
		System.out.println("controller bye method");
		return "bye";
	}
}
