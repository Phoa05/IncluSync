package com.fiap.IncluSync.port.out;

import com.fiap.IncluSync.application.domain.Station;

public interface StationRepository {
    boolean existsByName(String name);
    Station register(Station station);
}
