package com.uam.news.service;

import com.uam.news.dto.CommunityMemberDto;
import com.uam.news.dto.LoginResponse;
import com.uam.news.model.CommunityMember;
import com.uam.news.model.OriginalPoster;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface IServiceCommunityMember {
    public List<CommunityMember> getAll();

    public CommunityMember getByiD(Long id);

    public LoginResponse getUser(String email, String password);

    public CommunityMember save(CommunityMemberDto communityMemberDto);

    public void deleteById(Long id);
}
