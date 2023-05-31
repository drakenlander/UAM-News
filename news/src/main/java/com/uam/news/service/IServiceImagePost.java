package com.uam.news.service;

import com.uam.news.dto.ImagePostDto;
import com.uam.news.model.ImagePost;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceImagePost {
    public List<ImagePost> getAll();

    public ImagePost save(ImagePostDto imagePostDto);

    public void deleteById(Long id);
}
