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

        response.setMessage(model.generate("considerando se a pessoa possui deficiencia de mobilidade e os status das estações\n" +
                "\n" +
                "Possui deficiencia?" + user.isHasMobilityIssue()+"\n" +
                "Status das estações: {" + stationList + "}\n" +
                "\n" +
                "Descreva qual a melhor rota DE METRO em são paulo, partindo de " + directionAi.getStartAdd()+", com o objetivo de chegar em "+directionAi.getEndAdd()+". Considerando que pessoas com deficiencia física precisam utilizar estações cujas ferramentas de inclusão (rampas e elevadores) estejam em plena funcionalidade. (lembrando de responder em portugues brasil e valide se o caminho está correto)\n" +
                "\n" +
                "Não digite nada além do caminho, neste padrão:\n" +
                "----------------------------------------\n" +
                "Partida:       Jabaquara\n" +
                "Linha:         1 - Azul\n" +
                "Sentido:       Tucuruvi\n" +
                "\n" +
                "Baldeação:     Para Linha 2 - Verde - Estação Paraiso\n" +
                "Sentido:       Vila Madalena\n" +
                "Estações deslocadas: 3\n" +
                "\n" +
                "Destino:       Trianon–Masp\n" +
                "---------------------------------------- "));

        return response;
    }
}
