package com.uam.news.repository;

import com.uam.news.model.ImagePost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryImagePost extends JpaRepository<ImagePost, Long> {

}
