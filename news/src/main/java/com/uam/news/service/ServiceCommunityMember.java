package com.uam.news.service;

import com.uam.news.dto.CommunityMemberDto;
import com.uam.news.dto.LoginResponse;
import com.uam.news.model.CommunityMember;
import com.uam.news.model.OriginalPoster;
import com.uam.news.repository.IRepositoryCommunityMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCommunityMember implements IServiceCommunityMember {
    @Autowired
    private IRepositoryCommunityMember repo;

    @Override
    public List<CommunityMember> getAll() {
        return repo.findAll();
    }

    @Override
    public LoginResponse getUser(String email, String password) {
        LoginResponse lr = new LoginResponse(false, "Unable to connect...");
        CommunityMember u = repo.getUserByUser(email, password);

        if (u != null) {
            lr = new LoginResponse(true, "Connection stablished!");
        }

        return lr;
    }

    @Override
    public CommunityMember save(CommunityMemberDto communityMemberDto) {
        CommunityMember cm = new CommunityMember();

        cm.setUsId(communityMemberDto.getUsId());
        cm.setEmail(communityMemberDto.getEmail());
        cm.setPassword(communityMemberDto.getPassword());
        cm.setName(communityMemberDto.getName());
        cm.setPhoneNumber(communityMemberDto.getPhoneNumber());
        cm.setDepartment(communityMemberDto.getDepartment());

        return repo.save(cm);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
