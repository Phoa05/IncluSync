package com.fiap.IncluSync.application.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private boolean hasMobilityIssue;
    private String access;
}
