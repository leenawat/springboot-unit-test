package com.example.unittesting.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.unittesting.data.ItemRepository;
import com.example.unittesting.entity.Item;

@Service
public class ItemBusinessService {

	@Autowired
	ItemRepository repository;

	public Item retreiveHardcodedItem() {
		return new Item(1, "Ball", 10, 100);
	}

	public List<Item> retrieveAllItems() {
		List<Item> items = repository.findAll();
		for (Item item : items) {
			item.setValue(item.getPrice() * item.getQuantity());
		}
		return items;
	}

}
