package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fmehmood
 * @since June, 14 2019
 */
@RestController
public class HomeController {

	@GetMapping(path = "/hello")
	public String hello(){
		return "Hi, this is a sample text message";
	}

}
