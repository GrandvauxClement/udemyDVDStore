package com.amiltone.udemydvdstore.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
public class MovieDto implements Serializable {
    private final UUID id;
    private final String title;
    private final Integer numAvailable;
    private final KindDto kind;
    private final ActorDto principalActor;
    private final List<ActorDto> otherActor;
}
