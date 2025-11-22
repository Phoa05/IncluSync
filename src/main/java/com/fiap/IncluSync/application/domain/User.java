package com.fiap.IncluSync.application.domain;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Long id;
    @Column(name = "NAME")
    private String username;
    private String email;
    private String password;
    private boolean hasMobilityIssue;
    private String access;
}
