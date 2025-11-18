package com.fiap.IncluSync.adapter.in.station.dto;

import com.fiap.IncluSync.application.enums.OverAllStatus;
import lombok.Data;

@Data
public class StationRequestDto {
    private String name;
    private String temperature;
    private Integer crowdLevel;
    private String elevatorStatus;
    private OverAllStatus overallStatus;
}
