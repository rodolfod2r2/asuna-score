package org.framework.rodolfo.freire.git.asuna.score.gradient.boosting.machines.controller;


import org.framework.rodolfo.freire.git.asuna.score.gradient.boosting.machines.model.Score;
import org.framework.rodolfo.freire.git.asuna.score.gradient.boosting.machines.service.GBMService;
import org.framework.rodolfo.freire.git.asuna.score.gradient.boosting.machines.service.ScoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/score")
public class ScoreController {

    private final ScoreService scoreService;

    private final GBMService gbmService;

    public ScoreController(ScoreService scoreService, GBMService gbmService) {
        this.scoreService = scoreService;
        this.gbmService = gbmService;
    }

    @PostMapping("/predict")
    public Score predictScore(@RequestBody Score score) {
        // Chama o serviço para prever o score utilizando GBM
        return gbmService.predictScore(score);
    }

    @PostMapping("/train")
    public Score trainScoreModel(@RequestBody Score score) {
        // Chama o serviço para salvar um score (apenas exemplo básico, não inclui treinamento de modelo real)
        return scoreService.save(score);
    }
}
