package com.uam.news.controller;

import com.uam.news.dto.DepartmentDto;
import com.uam.news.model.Department;
import com.uam.news.service.IServiceDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/department")
@CrossOrigin("192.*.*.*")
public class ControllerDepartment {
    @Autowired
    private IServiceDepartment service;

    @GetMapping("/all")
    public List<Department> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    public Department save(@RequestBody DepartmentDto departmentDto) {
        return service.save(departmentDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
