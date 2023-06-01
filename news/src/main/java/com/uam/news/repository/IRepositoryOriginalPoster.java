package com.uam.news.repository;

import com.uam.news.model.OriginalPoster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryOriginalPoster extends JpaRepository<OriginalPoster, Long> {
    @Query("SELECT e FROM Usuario e WHERE e.email = :email AND e.password = :password")
    public OriginalPoster getUserByUser(@Param("email") String email, @Param("password") String password);
}
