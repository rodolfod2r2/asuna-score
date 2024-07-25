package org.framework.rodolfo.freire.git.asuna.score.regressao.linear.multipla.controller;


import org.framework.rodolfo.freire.git.asuna.score.regressao.linear.multipla.model.Score;
import org.framework.rodolfo.freire.git.asuna.score.regressao.linear.multipla.service.ScoreService;
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
        // Chama o serviço para calcular o score utilizando regressão linear múltipla
        return scoreService.calculateScore(score);
    }
}
