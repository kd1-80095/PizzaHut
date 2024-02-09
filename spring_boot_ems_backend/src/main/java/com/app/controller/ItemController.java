package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Items;
import com.app.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/add")
    public Items addItem(@RequestBody Items item) {
        return itemService.addItem(item);
    }

    @DeleteMapping("/remove/{id}")
    public void removeItem(@PathVariable Long id) {
        itemService.removeItem(id);
    }

    @PutMapping("/edit/{id}")
    public Items editItem(@PathVariable Long id, @RequestBody Items updatedItem) {
        return itemService.editItem(id, updatedItem);
    }

    @GetMapping("/all")
    public List<Items> getAllItems() {
        return itemService.getAllItems();
    }
}
