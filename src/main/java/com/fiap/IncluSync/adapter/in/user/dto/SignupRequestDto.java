package com.fiap.IncluSync.adapter.in.user.dto;

import lombok.Data;

@Data
public class SignupRequestDto {
    private String username;
    private String email;
    private String password;
    private boolean hasMobilityIssue;
    private String access;
}
