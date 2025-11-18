package com.fiap.IncluSync.adapter.out.mapper;

import com.fiap.IncluSync.adapter.in.station.dto.StationRequestDto;
import com.fiap.IncluSync.adapter.in.station.dto.StationResponseDto;
import com.fiap.IncluSync.adapter.out.persistence.entity.StationEntity;
import com.fiap.IncluSync.application.domain.Station;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StationMapper {
    StationMapper intance = Mappers.getMapper(StationMapper.class);

    StationEntity toEntity(Station station);
    Station toDomain(StationEntity entity);
    Station toDomain(StationRequestDto requestDto);
    StationResponseDto toResponseDto(Station station);
}
