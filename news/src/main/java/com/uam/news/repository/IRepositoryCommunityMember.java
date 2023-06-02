package com.uam.news.repository;

import com.uam.news.model.CommunityMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryCommunityMember extends JpaRepository<CommunityMember, Long> {
    @Query("SELECT e FROM Usuario e WHERE e.email = :email AND e.password = :password")
    public CommunityMember getUserByUser(@Param("email") String email, @Param("password") String password);
}
