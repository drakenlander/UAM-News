package com.uam.news.service;

import com.uam.news.dto.LoginResponse;
import com.uam.news.dto.OriginalPosterDto;
import com.uam.news.dto.QuickCheck;
import com.uam.news.model.OriginalPoster;
import com.uam.news.model.Usuario;
import com.uam.news.repository.IRepositoryOriginalPoster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOriginalPoster implements IServiceOriginalPoster {
    @Autowired
    private IRepositoryOriginalPoster repo;

    @Override
    public List<OriginalPoster> getAll() {
        return repo.findAll();
    }

    @Override
    public OriginalPoster getByiD(Long id) {
        return repo.getReferenceById(id);
    }

    @Override
    public LoginResponse getUser(String email, String password) {
        OriginalPoster u = repo.getUserByUser(email, password);
        LoginResponse lr = new LoginResponse(false, "Unable to connect...", null);

        if (u != null) {
            lr = new LoginResponse(true, "Connection stablished!", u);
        }

        return lr;
    }

    @Override
    public OriginalPoster save(OriginalPosterDto originalPosterDto) {
        OriginalPoster op = new OriginalPoster();

        op.setUsId(originalPosterDto.getUsId());
        op.setEmail(originalPosterDto.getEmail());
        op.setPassword(originalPosterDto.getPassword());
        op.setName(originalPosterDto.getName());
        op.setPhoneNumber(originalPosterDto.getPhoneNumber());
        op.setDepartment(originalPosterDto.getDepartment());

        return repo.save(op);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
