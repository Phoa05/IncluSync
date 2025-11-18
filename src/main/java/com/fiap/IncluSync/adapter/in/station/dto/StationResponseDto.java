package com.fiap.IncluSync.adapter.in.station.dto;

import com.fiap.IncluSync.application.enums.OverAllStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StationResponseDto {
    private Long id;
    private String name;
    private String temperature;
    private Integer crowdLevel;
    private String elevatorStatus;
    private OverAllStatus overallStatus;
    private LocalDateTime updatedAt;
}
