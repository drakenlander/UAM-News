package com.uam.news.repository;

import com.uam.news.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryCategory extends JpaRepository<Category, Long> {

}
