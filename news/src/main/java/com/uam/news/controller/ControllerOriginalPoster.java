package com.uam.news.controller;

import com.uam.news.dto.LoginResponse;
import com.uam.news.dto.OriginalPosterDto;
import com.uam.news.dto.QuickCheck;
import com.uam.news.model.OriginalPoster;
import com.uam.news.service.IServiceOriginalPoster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/originalPoster")
@CrossOrigin("192.*.*.*")
public class ControllerOriginalPoster {
    @Autowired
    private IServiceOriginalPoster service;

    @GetMapping("/all")
    public List<OriginalPoster> getAll() {
        return service.getAll();
    }

    @GetMapping("/login")
    public LoginResponse getLogin(@Param("email") String email, @Param("password") String password) {
        return service.getUser(email, password);
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
