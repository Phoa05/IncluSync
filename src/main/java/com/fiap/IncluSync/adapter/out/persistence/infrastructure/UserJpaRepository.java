package com.fiap.IncluSync.adapter.out.persistence.infrastructure;

import com.fiap.IncluSync.adapter.out.persistence.entity.StationEntity;
import com.fiap.IncluSync.adapter.out.persistence.entity.UserEntity;
import com.fiap.IncluSync.application.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
    boolean existsByEmail(String email);
    Optional<UserEntity> findByEmail(String email);
    Optional<List<UserEntity>> findAllUsers();
    Optional<StationEntity> update(Station station);
}
