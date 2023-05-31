package com.uam.news.service;

import com.uam.news.dto.CategoryDto;
import com.uam.news.model.Category;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface IServiceCategory {
    public List<Category> getAll();

    public Category save(CategoryDto categoryDto);

    public void deleteById(Long id);
}
