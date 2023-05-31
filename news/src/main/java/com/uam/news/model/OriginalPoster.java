package com.uam.news.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("op")

public class OriginalPoster extends Usuario {
}
