package com.uam.news.dto;

import com.uam.news.model.Department;
import lombok.Data;

@Data
public class OriginalPosterDto {
    private Long usId;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private Department department;
}
