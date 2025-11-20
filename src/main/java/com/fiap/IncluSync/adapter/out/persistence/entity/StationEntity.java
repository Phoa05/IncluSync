package com.fiap.IncluSync.adapter.out.persistence.entity;

import com.fiap.IncluSync.application.enums.OverAllStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "stations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String temperature;

    @Column(name = "crowd_level")
    private Integer crowdLevel;

    @Column(name = "elevator_status")
    private String elevatorStatus;

    @Column(name = "overall_status")
    @Enumerated(EnumType.STRING)
    private OverAllStatus overallStatus;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    private String line;

    // connections vira String
    @Column(length = 2000)
    private String connections;
}
