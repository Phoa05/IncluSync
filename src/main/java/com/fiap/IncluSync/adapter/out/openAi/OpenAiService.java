package com.fiap.IncluSync.adapter.out.openAi;

import com.fiap.IncluSync.adapter.out.openAi.dto.DirectionAiRequest;
import com.fiap.IncluSync.adapter.out.openAi.dto.DirectionAiResponse;
import com.fiap.IncluSync.application.domain.Station;
import com.fiap.IncluSync.application.domain.User;
import com.fiap.IncluSync.port.out.IOpenAi;
import com.fiap.IncluSync.port.out.StationRepository;
import com.fiap.IncluSync.port.out.UserRepository;
import dev.langchain4j.model.chat.ChatLanguageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpenAiService implements IOpenAi {
    private final ChatLanguageModel model;
    private final UserRepository userRepository;
    private final StationRepository stationRepository;

    @Autowired
    public OpenAiService(ChatLanguageModel model, UserRepository  userRepository, StationRepository stationRepository) {
        this.model = model;
        this.userRepository = userRepository;
        this.stationRepository = stationRepository;
    }

    @Override
    public DirectionAiResponse callOpenAi(DirectionAiRequest directionAi) {
        DirectionAiResponse response = new DirectionAiResponse();
        User user = userRepository.findByEmail(directionAi.getEmail());
        List<Station> stationList = stationRepository.getAllStations();

        response.setMessage(model.generate(
                "Considere que o usuário pode ter deficiência de mobilidade, e ele só pode utilizar estações com acessibilidade totalmente funcional (elevadores e rampas operantes).\n" +
                        "\n" +
                        "Possui deficiência de mobilidade: " + user.isHasMobilityIssue() + "\n" +
                        "Status das estações (com nomes exatos + status de acessibilidade): {" + stationList + "}.\n" +
                        "\n" +
                        "Objetivo:\n" +
                        "Descrever EXATAMENTE UMA rota de metrô em São Paulo, partindo de " + directionAi.getStartAdd() + " e chegando em " + directionAi.getEndAdd() + ".\n" +
                        "\n" +
                        "Regras obrigatórias:\n" +
                        "- Utilize TODAS as linhas possíveis do metrô/monotrilho/CPTM que façam sentido para o menor caminho, incluindo linhas privadas como a Linha 4-Amarela e 5-Lilás.\n" +
                        "- NÃO exiba nenhuma estação cujo status de acessibilidade esteja indisponível.\n" +
                        "- NÃO escreva notas, explicações, avisos, justificativas ou qualquer texto fora do padrão solicitado.\n" +
                        "- O sentido deve ser o sentido REAL que o usuário irá PEGAR.\n" +
                        "- Sempre exiba o status de acessibilidade de cada estação.\n" +
                        "- Exibir somente UM caminho, completo, com todas as baldeações necessárias.\n" +
                        "- Realize a menor quantidade de baldeações possíveis.\n" +
                        "\n" +
                        "Formato obrigatório da resposta:\n" +
                        "----------------------------------------\n" +
                        "Partida:       [Nome da estação]\n" +
                        "Linha:         [Número e nome da linha]\n" +
                        "Sentido:       [Sentido correto]\n" +
                        "Status da acessibilidade: [Informação da estação]\n" +
                        "Temperatura: [Temperatura média da estação]\n" +
                        "Nível de lotação (0-100): [crowd_level]\n" +
                        "\n" +
                        "Baldeação:     Estação [Nome]\n" +
                        "Sentido:       [Sentido correto]\n" +
                        "Status da acessibilidade: [Informação da estação]\n" +
                        "Temperatura: [Temperatura média da estação]\n" +
                        "Nível de lotação (0-100): [crowd_level]\n" +
                        "\n" +
                        "Destino:       [Nome da estação final]\n" +
                        "----------------------------------------\n" +
                        "\n" +
                        "Gere agora a rota seguindo EXATAMENTE esse formato e nada além disso."
        ));




        return response;
    }
}
