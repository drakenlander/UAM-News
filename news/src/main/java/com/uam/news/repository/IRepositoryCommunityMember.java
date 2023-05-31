package com.uam.news.repository;

import com.uam.news.model.CommunityMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryCommunityMember extends JpaRepository<CommunityMember, Long> {

}
