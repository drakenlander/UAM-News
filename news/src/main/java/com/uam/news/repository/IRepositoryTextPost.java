package com.uam.news.repository;

import com.uam.news.model.TextPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryTextPost extends JpaRepository<TextPost, Long> {

}
