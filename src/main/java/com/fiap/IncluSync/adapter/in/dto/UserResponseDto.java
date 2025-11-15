package com.fiap.IncluSync.adapter.in.dto;

import lombok.Data;

@Data
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
    private boolean hasMobilityIssue;
}
