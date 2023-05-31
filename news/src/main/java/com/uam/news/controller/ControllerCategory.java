package com.uam.news.controller;

import com.uam.news.dto.CategoryDto;
import com.uam.news.model.Category;
import com.uam.news.service.IServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/category")
public class ControllerCategory {
    @Autowired
    private IServiceCategory service;

    @GetMapping("/all")
    public List<Category> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    public Category save(@RequestBody CategoryDto categoryDto) {
        return service.save(categoryDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
