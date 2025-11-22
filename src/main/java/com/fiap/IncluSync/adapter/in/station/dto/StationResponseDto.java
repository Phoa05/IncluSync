package com.fiap.IncluSync.adapter.in.station.dto;

import com.fiap.IncluSync.application.enums.OverAllStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class StationResponseDto {
    private Long id;
    private String name;
    private String temperature;
    private Integer crowdLevel;
    private String elevatorStatus;
    private OverAllStatus overallStatus;
    private LocalDateTime updatedAt;

    private String line;                 // Linha da estação (ex: "1-Azul")
    private List<String> connections;    // Linhas de conexão (ex: ["3-Vermelha", "4-Amarela"])
}
