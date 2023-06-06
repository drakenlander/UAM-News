package com.uam.news.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("op")

public class OriginalPoster extends Usuario {
}
