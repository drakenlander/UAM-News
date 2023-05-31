package com.uam.news.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("img")

public class ImagePost extends Post{
    private String url;
}
