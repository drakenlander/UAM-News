package com.uam.news.dto;

import com.uam.news.model.Category;
import com.uam.news.model.Department;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ImagePostDto {
    private Long postId;
    private LocalDateTime publicationdate = LocalDateTime.now();
    private int saveCount;
    private String caption;
    private Department department;
    private Category category;
    private String url;
}
