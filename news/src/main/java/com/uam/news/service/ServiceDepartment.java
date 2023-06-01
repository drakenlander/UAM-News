package com.uam.news.service;

import com.uam.news.dto.DepartmentDto;
import com.uam.news.model.Department;
import com.uam.news.model.Usuario;
import com.uam.news.repository.IRepositoryDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceDepartment implements IServiceDepartment {
    @Autowired
    private IRepositoryDepartment repo;
    
    @Override
    public List<Department> getAll() {
        return repo.findAll();
    }

    @Override
    public Department save(DepartmentDto departmentDto) {
        List<Usuario> details  = departmentDto.getDetails();
        List<Usuario> data = new ArrayList<>();

        Department master = new Department();
        master.setName(departmentDto.getName());

        for (Usuario usuario : details) {
            Usuario us  = new Usuario();

            us.setDepartment(master);
            us.setEmail(usuario.getEmail());
            us.setPassword(usuario.getPassword());
            us.setName(usuario.getName());
            us.setPhoneNumber(usuario.getPhoneNumber());

            data.add(us);
        }

        //master.setDetails(data);
        return repo.save(master);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
