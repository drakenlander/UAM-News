package com.uam.news.repository;

import com.uam.news.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryDepartment extends JpaRepository<Department, Long> {

}
