package com.uam.news.service;

import com.uam.news.dto.DepartmentDto;
import com.uam.news.model.Department;
import com.uam.news.model.Post;
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
        List<Post> pDetails = departmentDto.getPDetails();
        List<Post> pData = new ArrayList<>();

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

        for (Post post : pDetails) {
            Post p = new Post();

            p.setDepartment(master);
            p.setSaveCount(post.getSaveCount());
            p.setCaption(post.getCaption());

            pData.add(p);
        }

        //master.setDetails(data);
        //master.setPDetails(pData);
        return repo.save(master);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
