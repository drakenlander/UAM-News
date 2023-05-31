package com.uam.news.controller;

import com.uam.news.dto.CommunityMemberDto;
import com.uam.news.model.CommunityMember;
import com.uam.news.service.IServiceCommunityMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/communityMember")
public class ControllerCommunityMember {
    @Autowired
    private IServiceCommunityMember service;

    @GetMapping("/all")
    public List<CommunityMember> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    public CommunityMember save(@RequestBody CommunityMemberDto communityMemberDto) {
        return service.save(communityMemberDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
