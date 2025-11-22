package com.fiap.IncluSync.application.usecase;

import com.fiap.IncluSync.adapter.in.station.dto.StationRequestDto;
import com.fiap.IncluSync.adapter.in.station.dto.StationResponseDto;
import com.fiap.IncluSync.adapter.out.mapper.StationMapper;
import com.fiap.IncluSync.application.domain.Station;
import com.fiap.IncluSync.application.exception.StationNotFoundException;
import com.fiap.IncluSync.application.exception.StationRegisteredException;
import com.fiap.IncluSync.port.in.IStation;
import com.fiap.IncluSync.port.out.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StationUseCase implements IStation {

    private final StationRepository stationRepository;

    @Override
    public StationResponseDto register(StationRequestDto requestDto) {
        Station station = StationMapper.intance.toDomain(requestDto);

        if(stationRepository.existsByName(station.getName())){
            throw new StationRegisteredException("Station " + station.getName() + " already registered!");
        }

        return StationMapper.intance.toResponseDto(stationRepository.register(station));
    }

    @Override
    public StationResponseDto update(StationRequestDto requestDto) {
        Station station = StationMapper.intance.toDomain(requestDto);

        if (!stationRepository.existsByName(station.getName())) {
            throw new StationNotFoundException("Station " + station.getName() + " not registered!");
        }

        return StationMapper.intance.toResponseDto(stationRepository.update(station));
    }

    @Override
    public List<StationResponseDto> getAllStations() {
        return StationMapper.intance.toListResponseDto(stationRepository.getAllStations());
    }


}
