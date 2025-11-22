package com.fiap.IncluSync.adapter.out.openAi.dto;

import lombok.Data;

@Data
public class DirectionAiRequest {
    private String email;
    private String startAdd;
    private String endAdd;
}
