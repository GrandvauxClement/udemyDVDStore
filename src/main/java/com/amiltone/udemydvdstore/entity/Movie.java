package com.amiltone.udemydvdstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class Movie extends AbstractEntity{
    private String title;

    private Integer numAvailable;

    @ManyToOne
    private Kind kind;

    @ManyToOne
    private Actor principalActor;

    @ManyToMany
    private List<Actor> otherActor = new ArrayList<>();
}
