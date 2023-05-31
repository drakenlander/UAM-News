package com.uam.news.service;

import com.uam.news.dto.DepartmentDto;
import com.uam.news.model.Department;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface IServiceDepartment {
    public List<Department> getAll();

    public Department save(DepartmentDto departmentDto);

    public void deleteById(Long id);
}
