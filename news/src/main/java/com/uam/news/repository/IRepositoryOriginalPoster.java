package com.uam.news.repository;

import com.uam.news.model.OriginalPoster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryOriginalPoster extends JpaRepository<OriginalPoster, Long> {

}
