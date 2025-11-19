package com.fiap.IncluSync.port.out;

import com.fiap.IncluSync.adapter.out.openAi.dto.DirectionAiRequest;
import com.fiap.IncluSync.adapter.out.openAi.dto.DirectionAiResponse;

public interface IOpenAi {
    DirectionAiResponse callOpenAi(DirectionAiRequest directionAi);
}
