package com.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ItemDao;
import com.app.entities.Items;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    public Items addItem(Items item) {
        return itemDao.save(item);
    }

    public void removeItem(Long id) {
        itemDao.deleteById(id);
    }

    public Items editItem(Long id, Items updatedItem) {
        Items itemToUpdate = itemDao.findById(id).orElse(null);
        if (itemToUpdate != null) {
            itemToUpdate.setItemName(updatedItem.getItemName());
            itemToUpdate.setItemDescription(updatedItem.getItemDescription());
            itemToUpdate.setItemPrice(updatedItem.getItemPrice());
            itemToUpdate.setImage(updatedItem.getImage());
            return itemDao.save(itemToUpdate);
        }
        return null; // or throw an exception
    }

    public List<Items> getAllItems() {
        return itemDao.findAll();
    }
}
