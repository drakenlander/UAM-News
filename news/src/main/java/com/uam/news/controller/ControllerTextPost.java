package com.uam.news.controller;

import com.uam.news.dto.TextPostDto;
import com.uam.news.model.TextPost;
import com.uam.news.service.IServiceTextPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/TextPost")
@CrossOrigin("192.*.*.*")
public class ControllerTextPost {
    @Autowired
    private IServiceTextPost service;

    @GetMapping("/all")
    public List<TextPost> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    public TextPost save(@RequestBody TextPostDto textPostDto) {
        return service.save(textPostDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
