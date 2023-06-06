package com.uam.news.service;

import com.uam.news.dto.LoginResponse;
import com.uam.news.dto.OriginalPosterDto;
import com.uam.news.dto.QuickCheck;
import com.uam.news.model.OriginalPoster;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceOriginalPoster {
    public List<OriginalPoster> getAll();

    public OriginalPoster getByiD(Long id);

    public LoginResponse getUser(String email, String password);

    public OriginalPoster save(OriginalPosterDto originalPosterDto);

    public void deleteById(Long id);
}
