package com.amiltone.udemydvdstore.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class ActorDto implements Serializable {
    private final UUID id;
    private final String firstName;
    private final String lastName;
}
