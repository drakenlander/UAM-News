package com.uam.news.dto;

import com.uam.news.model.Post;
import lombok.Data;
import java.util.List;

@Data
public class CategoryDto {
    private Long catId;
    private String name;
    private List<Post> details;
}
