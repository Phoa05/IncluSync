package com.fiap.IncluSync.port.in;

import com.fiap.IncluSync.adapter.in.station.dto.StationRequestDto;
import com.fiap.IncluSync.adapter.in.station.dto.StationResponseDto;

public interface IStation {
    StationResponseDto register(StationRequestDto requestDto);
}
