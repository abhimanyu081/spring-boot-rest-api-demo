package com.springboot.starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")  //By Default its RequestMethod is GET
	public String sayHi() {
		return "Hi";
	}
}
