package com.example.unittesting.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.unittesting.entity.Item;

public interface ItemRepository  extends JpaRepository<Item, Integer>{

}
