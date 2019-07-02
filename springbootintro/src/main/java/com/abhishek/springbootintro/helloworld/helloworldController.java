package com.abhishek.springbootintro.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldController {

	@RequestMapping("/helloworld")
	public String hello() {
		return "helloworld";
		
	}
}
