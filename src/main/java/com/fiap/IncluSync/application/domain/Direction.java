package com.fiap.IncluSync.application.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Direction {
    private String email;
    private String startAdd;
    private String endAdd;
    private String message;
}
