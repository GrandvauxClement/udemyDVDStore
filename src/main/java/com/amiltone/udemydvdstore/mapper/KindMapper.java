package com.amiltone.udemydvdstore.mapper;

import com.amiltone.udemydvdstore.dto.KindDto;
import com.amiltone.udemydvdstore.entity.Kind;

public class KindMapper {

    public static KindDto mapKindToKindDto(Kind kind){
        return new KindDto(
                kind.getId(),
                kind.getName()
        );
    }

    public static Kind mapKindDtoToKind(KindDto kindDto){
        return new Kind(
                kindDto.getId(),
                kindDto.getName()
        );
    }
}
