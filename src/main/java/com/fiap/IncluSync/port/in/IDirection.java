package com.fiap.IncluSync.port.in;

import com.fiap.IncluSync.adapter.in.direction.dto.DirectionRequestDto;
import com.fiap.IncluSync.adapter.in.direction.dto.DirectionResponseDto;

public interface IDirection {
    DirectionResponseDto getDirection(DirectionRequestDto requestDto);
}
