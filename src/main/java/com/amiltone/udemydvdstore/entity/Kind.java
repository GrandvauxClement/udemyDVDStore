package com.amiltone.udemydvdstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Kind extends AbstractEntity{

    private String name;

    @OneToMany(mappedBy = "kind")
    private List<Movie> movieList = new ArrayList<>();
}
