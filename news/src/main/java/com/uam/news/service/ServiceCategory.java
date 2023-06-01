package com.uam.news.service;

import com.uam.news.dto.CategoryDto;
import com.uam.news.model.Category;
import com.uam.news.model.Post;
import com.uam.news.repository.IRepositoryCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCategory implements IServiceCategory {
    @Autowired
    private IRepositoryCategory repo;

    @Override
    public List<Category> getAll() {
        return repo.findAll();
    }

    @Override
    public Category save(CategoryDto categoryDto) {
        List<Post> details  = categoryDto.getDetails();
        List<Post> data = new ArrayList<>();

        Category master = new Category();
        master.setName(categoryDto.getName());

        for (Post post : details) {
            Post p  = new Post();

            p.setCategory(master);
            p.setSaveCount(post.getSaveCount());
            p.setCaption(post.getCaption());

            data.add(p);
        }

        //master.setDetails(data);
        return repo.save(master);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
