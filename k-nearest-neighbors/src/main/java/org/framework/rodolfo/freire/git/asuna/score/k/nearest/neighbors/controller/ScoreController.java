package org.framework.rodolfo.freire.git.asuna.score.k.nearest.neighbors.controller;


import org.framework.rodolfo.freire.git.asuna.score.k.nearest.neighbors.model.Score;
import org.framework.rodolfo.freire.git.asuna.score.k.nearest.neighbors.service.KNNService;
import org.framework.rodolfo.freire.git.asuna.score.k.nearest.neighbors.service.ScoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/score")
public class ScoreController {

    private final ScoreService scoreService;

    private final KNNService knnService;

    public ScoreController(ScoreService scoreService, KNNService knnService) {
        this.scoreService = scoreService;
        this.knnService = knnService;
    }

    @PostMapping("/classifyKNN")
    public Score classifyRiskKNN(@RequestBody Score score) {
        // Chama o serviço para classificar o risco utilizando KNN
        return knnService.classifyRisk(score);
    }

    @PostMapping("/train")
    public Score trainScoreModel(@RequestBody Score score) {
        // Chama o serviço para salvar um score (apenas exemplo básico, não inclui treinamento de modelo real)
        return scoreService.save(score);
    }
}
