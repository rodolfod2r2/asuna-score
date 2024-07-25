package org.framework.rodolfo.freire.git.asuna.score.maquina.vetores.suporte.controller;


import org.framework.rodolfo.freire.git.asuna.score.maquina.vetores.suporte.model.Score;
import org.framework.rodolfo.freire.git.asuna.score.maquina.vetores.suporte.service.SVMService;
import org.framework.rodolfo.freire.git.asuna.score.maquina.vetores.suporte.service.ScoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/score")
public class ScoreController {
    private final ScoreService scoreService;

    private final SVMService svmService;

    public ScoreController(ScoreService scoreService, SVMService svmService) {
        this.scoreService = scoreService;
        this.svmService = svmService;
    }

    @PostMapping("/classify")
    public Score classifyRisk(@RequestBody Score score) {
        // Chama o serviço para classificar o risco utilizando SVM
        return svmService.classifyRisk(score);
    }

    @PostMapping("/train")
    public Score trainScoreModel(@RequestBody Score score) {
        // Chama o serviço para salvar um score (apenas exemplo básico, não inclui treinamento de modelo real)
        return scoreService.save(score);
    }
}
