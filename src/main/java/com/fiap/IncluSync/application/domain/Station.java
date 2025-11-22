package com.fiap.IncluSync.application.domain;

import com.fiap.IncluSync.application.enums.OverAllStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Station {
    private Long id;
    private String name;
    private String temperature;
    private Integer crowdLevel;
    private String elevatorStatus;
    private OverAllStatus overallStatus;
    private LocalDateTime updatedAt;

    private String line;
    private List<String> connections;
    private List<String> directions;
}
