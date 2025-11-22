package com.fiap.IncluSync.adapter.out.mapper;

import com.fiap.IncluSync.adapter.in.direction.dto.DirectionRequestDto;
import com.fiap.IncluSync.adapter.in.direction.dto.DirectionResponseDto;
import com.fiap.IncluSync.adapter.out.openAi.dto.DirectionAiRequest;
import com.fiap.IncluSync.adapter.out.openAi.dto.DirectionAiResponse;
import com.fiap.IncluSync.application.domain.Direction;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DirectionMapper {
    DirectionMapper instance = Mappers.getMapper(DirectionMapper.class);

    Direction toDomain(DirectionRequestDto requestDto);
    DirectionResponseDto toResponseDto(DirectionAiResponse direction);
    DirectionAiRequest toAi(Direction requestDto);
}
