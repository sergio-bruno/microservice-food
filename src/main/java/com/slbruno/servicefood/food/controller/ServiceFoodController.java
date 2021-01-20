package com.slbruno.servicefood.food.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sf/hello")
public class ServiceFoodController {

	@GetMapping
	public String Hello() {
		return "Hi, service food ok, 1ª message...";
	}
}
