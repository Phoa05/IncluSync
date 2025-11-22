package com.fiap.IncluSync.adapter.out.persistence.infrastructure;

import com.fiap.IncluSync.adapter.out.persistence.entity.StationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationJpaRepository extends JpaRepository<StationEntity, Long> {
    boolean existsByName(String name);
    StationEntity findByName(String name);
}
