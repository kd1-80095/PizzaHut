package com.app.service;

import java.util.List;

import com.app.entities.Items;

public interface ItemService {

	 public Items addItem(Items item);
	 public void removeItem(Long id);
	 public Items editItem(Long id, Items updatedItem);
	 public List<Items> getAllItems();
}
