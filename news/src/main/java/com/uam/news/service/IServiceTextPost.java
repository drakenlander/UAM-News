package com.uam.news.service;

import com.uam.news.dto.TextPostDto;
import com.uam.news.model.TextPost;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceTextPost {
    public List<TextPost> getAll();

    public TextPost save(TextPostDto textpostDto);

    public void deleteById(Long id);
}
