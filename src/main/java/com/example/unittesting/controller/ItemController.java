package com.example.unittesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unittesting.entity.Item;

@RestController
public class ItemController {
	
	@GetMapping("/dummy-item")
	public Item helloWorld() {
		return new Item(1, "Ball", 10, 100);
	}
}
