package com.fiap.IncluSync.adapter.in.auth.dto;

import lombok.Data;

@Data
public class LoginResponseDto {
    private Integer code;
    private Long id;
    private String username;
    private String email;
    private boolean hasMobilityIssue;
    private String access;
}
