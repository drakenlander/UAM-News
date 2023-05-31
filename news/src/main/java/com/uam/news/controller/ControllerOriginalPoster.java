package com.uam.news.controller;

import com.uam.news.dto.OriginalPosterDto;
import com.uam.news.model.OriginalPoster;
import com.uam.news.service.IServiceOriginalPoster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/originalPoster")
public class ControllerOriginalPoster {
    @Autowired
    private IServiceOriginalPoster service;

    @GetMapping("/all")
    public List<OriginalPoster> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    public OriginalPoster save(@RequestBody OriginalPosterDto originalPosterDto) {
        return service.save(originalPosterDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
