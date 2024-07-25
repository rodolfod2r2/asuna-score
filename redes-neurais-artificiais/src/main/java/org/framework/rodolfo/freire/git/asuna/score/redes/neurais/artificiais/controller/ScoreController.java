package org.framework.rodolfo.freire.git.asuna.score.redes.neurais.artificiais.controller;


import org.framework.rodolfo.freire.git.asuna.score.redes.neurais.artificiais.model.Score;
import org.framework.rodolfo.freire.git.asuna.score.redes.neurais.artificiais.service.NeuralNetworkService;
import org.framework.rodolfo.freire.git.asuna.score.redes.neurais.artificiais.service.ScoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/score")
public class ScoreController {

    private final ScoreService scoreService;

    private final NeuralNetworkService neuralNetworkService;

    public ScoreController(ScoreService scoreService, NeuralNetworkService neuralNetworkService) {
        this.scoreService = scoreService;
        this.neuralNetworkService = neuralNetworkService;
    }

    @PostMapping("/predict")
    public Score predictScore(@RequestBody Score score) {
        // Chama o serviço para prever o score utilizando Redes Neurais Artificiais (ANN)
        return neuralNetworkService.predictScore(score);
    }

    @PostMapping("/train")
    public Score trainScoreModel(@RequestBody Score score) {
        // Chama o serviço para salvar um score (apenas exemplo básico, não inclui treinamento de modelo real)
        return scoreService.save(score);
    }
}