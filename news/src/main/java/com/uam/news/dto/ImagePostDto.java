package com.uam.news.dto;

import com.uam.news.model.Category;
import com.uam.news.model.Department;
import lombok.Data;

@Data
public class ImagePostDto {
    private Long postId;
    //private String publicationdate;
    private int saveCount;
    private String caption;
    private Department department;
    private Category category;
    private String url;
}
