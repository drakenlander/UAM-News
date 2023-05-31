package com.uam.news.dto;

import com.uam.news.model.Category;
import lombok.Data;

@Data
public class ImagePostDto {
    private Long postId;
    //private String publicationdate;
    private int saveCount;
    private String caption;
    private Category category;
    private String url;
}
