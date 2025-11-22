package com.fiap.IncluSync.adapter.out.openAi.config;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAiConfig {

    @Value("${openai.api-key}")
    private String apiKey;

    @Bean
    public ChatLanguageModel chatLanguageModel() {
        return OpenAiChatModel.builder()
                .temperature(1.0)
                .apiKey(apiKey)
                .modelName("gpt-4o-mini")
                .build();
    }
}
