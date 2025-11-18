package com.fiap.IncluSync.adapter.in.user.dto;

import lombok.Data;

@Data
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
    private boolean hasMobilityIssue;
}
