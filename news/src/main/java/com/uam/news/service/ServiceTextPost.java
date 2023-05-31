package com.uam.news.service;

import com.uam.news.dto.TextPostDto;
import com.uam.news.model.TextPost;
import com.uam.news.repository.IRepositoryTextPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceTextPost implements IServiceTextPost {
    @Autowired
    private IRepositoryTextPost repo;

    @Override
    public List<TextPost> getAll() {
        return repo.findAll();
    }

    @Override
    public TextPost save(TextPostDto textpostDto) {
        TextPost txt = new TextPost();

        txt.setPostId(textpostDto.getPostId());
        txt.setSaveCount(textpostDto.getSaveCount());
        txt.setCaption(textpostDto.getCaption());
        txt.setCategory(textpostDto.getCategory());

        return repo.save(txt);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
