package com.uam.news.controller;

import com.uam.news.dto.ImagePostDto;
import com.uam.news.model.ImagePost;
import com.uam.news.service.IServiceImagePost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ImagePost")
public class ControllerImagePost {
    @Autowired
    private IServiceImagePost service;

    @GetMapping("/all")
    public List<ImagePost> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    public ImagePost save(@RequestBody ImagePostDto imagePostDto) {
        return service.save(imagePostDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
