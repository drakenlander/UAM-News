package com.uam.news.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("txt")

public class TextPost extends Post {
}
