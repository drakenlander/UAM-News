package com.uam.news.service;

import com.uam.news.dto.ImagePostDto;
import com.uam.news.model.ImagePost;
import com.uam.news.repository.IRepositoryImagePost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceImagePost implements IServiceImagePost {
    @Autowired
    private IRepositoryImagePost repo;

    @Override
    public List<ImagePost> getAll() {
        return repo.findAll();
    }

    @Override
    public ImagePost save(ImagePostDto imagePostDto) {
        ImagePost img = new ImagePost();

        img.setPostId(imagePostDto.getPostId());
        img.setSaveCount(imagePostDto.getSaveCount());
        img.setCaption(imagePostDto.getCaption());
        img.setDepartment(imagePostDto.getDepartment());
        img.setCategory(imagePostDto.getCategory());
        img.setUrl(imagePostDto.getUrl());

        return repo.save(img);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
