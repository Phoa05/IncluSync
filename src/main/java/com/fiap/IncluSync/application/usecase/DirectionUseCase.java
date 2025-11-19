package com.fiap.IncluSync.application.usecase;

import com.fiap.IncluSync.adapter.in.direction.dto.DirectionRequestDto;
import com.fiap.IncluSync.adapter.in.direction.dto.DirectionResponseDto;
import com.fiap.IncluSync.adapter.out.mapper.DirectionMapper;
import com.fiap.IncluSync.adapter.out.openAi.dto.DirectionAiResponse;
import com.fiap.IncluSync.application.domain.Direction;
import com.fiap.IncluSync.port.in.IDirection;
import com.fiap.IncluSync.port.out.IOpenAi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DirectionUseCase implements IDirection {

    private final IOpenAi delegate;

    @Override
    public DirectionResponseDto getDirection(DirectionRequestDto requestDto) {
        Direction domain =  DirectionMapper.instance.toDomain(requestDto);
        DirectionAiResponse response = delegate.callOpenAi(DirectionMapper.instance.toAi(domain));

        return DirectionMapper.instance.toResponseDto(response);
    }
}
