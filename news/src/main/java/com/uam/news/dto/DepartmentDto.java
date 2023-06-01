package com.uam.news.dto;

import com.uam.news.model.Post;
import com.uam.news.model.Usuario;
import lombok.Data;
import java.util.List;

@Data
public class DepartmentDto {
    private Long deptId;
    private String name;
    private List<Usuario> details;
    private List<Post> pDetails;
}
