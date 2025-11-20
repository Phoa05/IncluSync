package com.fiap.IncluSync.adapter.out.mapper;

import com.fiap.IncluSync.adapter.in.station.dto.StationRequestDto;
import com.fiap.IncluSync.adapter.in.station.dto.StationResponseDto;
import com.fiap.IncluSync.adapter.out.persistence.entity.StationEntity;
import com.fiap.IncluSync.application.domain.Station;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface StationMapper {

    StationMapper intance = Mappers.getMapper(StationMapper.class);

    // Domain → Entity
    @Mapping(source = "connections", target = "connections", qualifiedByName = "listToString")
    StationEntity toEntity(Station station);

    // Entity → Domain
    @Mapping(source = "connections", target = "connections", qualifiedByName = "stringToList")
    Station toDomain(StationEntity entity);

    // Request DTO → Domain
    @Mapping(target = "connections", ignore = true) // RequestDto não tem connections
    Station toDomain(StationRequestDto requestDto);

    // Domain → Response DTO
    StationResponseDto toResponseDto(Station station);

    List<Station> toListDomain(List<StationEntity> list);
    List<StationResponseDto> toListResponseDto(List<Station> list);


    // ======================================
    // Conversores personalizados
    // ======================================

    @Named("listToString")
    default String mapListToString(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return String.join(",", list);
    }

    @Named("stringToList")
    default List<String> mapStringToList(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return Arrays.stream(str.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }
}
