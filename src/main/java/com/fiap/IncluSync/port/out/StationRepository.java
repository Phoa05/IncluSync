package com.fiap.IncluSync.port.out;

import com.fiap.IncluSync.application.domain.Station;

import java.util.List;

public interface StationRepository {
    boolean existsByName(String name);
    Station register(Station station);
    Station update(Station station);
    List<Station> getAllStations();
}
