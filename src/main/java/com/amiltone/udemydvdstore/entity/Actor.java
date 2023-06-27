package com.amiltone.udemydvdstore.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Actor extends AbstractEntity{

    private String firstName;

    private String lastName;
}
