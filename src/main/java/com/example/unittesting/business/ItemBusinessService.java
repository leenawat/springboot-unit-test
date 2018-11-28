package com.example.unittesting.business;

import org.springframework.stereotype.Service;

import com.example.unittesting.entity.Item;

@Service
public class ItemBusinessService {

	public Item retreiveHardcodedItem() {
		return new Item(1, "Ball", 10, 100);
	}

}
