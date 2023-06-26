package com.amiltone.udemydvdstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Kind extends AbstractEntity{

    private String name;

    @OneToMany(mappedBy = "kind")
    private List<Movie> movieList = new ArrayList<>();
}
