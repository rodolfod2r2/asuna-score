package org.framework.rodolfo.freire.git.asuna.score.regressao.logistica.controller;

import org.framework.rodolfo.freire.git.asuna.score.regressao.logistica.model.Score;
import org.framework.rodolfo.freire.git.asuna.score.regressao.logistica.service.ScoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/score")
public class ScoreController {

    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }


    @PostMapping("/train")
    public Score trainScoreModel(@RequestBody Score score) {
        // Lógica para treinar o modelo (Exemplo com Regressão Logística)
        // Aqui poderia ser implementado qualquer um dos outros algoritmos mencionados

        // Simulação de treinamento (apenas exemplo)
        // Suponha que estamos usando Regressão Logística para calcular um score baseado nos inputs
        double[] inputs = score.getInputs();
        double output = calculateScore(inputs);

        score.setOutput(output);

        // Salva o score treinado no banco de dados
        return scoreService.save(score);
    }

    // Exemplo simples de Regressão Logística (para fins ilustrativos)
    private double calculateScore(double[] inputs) {
        // Implementação básica para calcular um score
        // Aqui poderia ser substituído por qualquer um dos outros algoritmos mencionados

        // Exemplo: calcula o score como a média dos inputs
        double sum = 0.0;
        for (double input : inputs) {
            sum += input;
        }
        return sum / inputs.length;
    }
}

