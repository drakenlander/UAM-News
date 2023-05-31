package com.uam.news.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("cm")

public class CommunityMember extends Usuario {
}
