package com.fiap.IncluSync.adapter.out.persistence;

import com.fiap.IncluSync.adapter.out.mapper.StationMapper;
import com.fiap.IncluSync.adapter.out.persistence.entity.StationEntity;
import com.fiap.IncluSync.adapter.out.persistence.infrastructure.StationJpaRepository;
import com.fiap.IncluSync.application.domain.Station;
import com.fiap.IncluSync.application.exception.StationNotFoundException;
import com.fiap.IncluSync.port.out.StationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class StationRepositoryAdapter implements StationRepository {

    private final StationJpaRepository stationJpaRepository;

    @Override
    public boolean existsByName(String name) {
        return stationJpaRepository.existsByName(name);
    }

    @Override
    public Station register(Station station) {
        station.setUpdatedAt(LocalDateTime.now());
        StationEntity entity = stationJpaRepository.save(StationMapper.intance.toEntity(station));
        log.info("Station saved with id {}", entity.getId());

        return StationMapper.intance.toDomain(entity);
    }

    @Override
    public Station update(Station station) {
        StationEntity entity = stationJpaRepository.save(StationMapper.intance.toEntity(station));
        log.info("Station {} updated", entity.getId());

        return StationMapper.intance.toDomain(entity);
    }

    @Override
    public List<Station> getAllStations() {
        List<StationEntity> stations = stationJpaRepository.findAll();
        if (stations.isEmpty()) {
            throw new StationNotFoundException("No stations found");
        }
        return StationMapper.intance.toListDomain(stations);
    }


}
