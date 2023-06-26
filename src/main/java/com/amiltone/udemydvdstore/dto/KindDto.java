package com.amiltone.udemydvdstore.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class KindDto implements Serializable {
    private final UUID id;
    private final String name;
}
