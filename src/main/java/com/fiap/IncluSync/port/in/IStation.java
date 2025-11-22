package com.fiap.IncluSync.port.in;

import com.fiap.IncluSync.adapter.in.station.dto.StationRequestDto;
import com.fiap.IncluSync.adapter.in.station.dto.StationResponseDto;

import java.util.List;

public interface IStation {
    StationResponseDto register(StationRequestDto requestDto);
    StationResponseDto update(StationRequestDto requestDto);
    List<StationResponseDto> getAllStations();
}
