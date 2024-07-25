package org.framework.rodolfo.freire.git.asuna.score.arvore.decisao.controller;


import org.framework.rodolfo.freire.git.asuna.score.arvore.decisao.model.Score;
import org.framework.rodolfo.freire.git.asuna.score.arvore.decisao.service.DecisionTreeService;
import org.framework.rodolfo.freire.git.asuna.score.arvore.decisao.service.ScoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/score")
public class ScoreController {

    private final ScoreService scoreService;

    private final DecisionTreeService decisionTreeService;

    public ScoreController(ScoreService scoreService, DecisionTreeService decisionTreeService) {
        this.scoreService = scoreService;
        this.decisionTreeService = decisionTreeService;
    }

    @PostMapping("/api/score/classify")
    public Score classifyRisk(@RequestBody Score score) {
        // Chama o serviço para classificar o risco utilizando Árvore de Decisão
        return decisionTreeService.classifyRisk(score);
    }

    @PostMapping("/api/score/train")
    public Score trainScoreModel(@RequestBody Score score) {
        // Chama o serviço para salvar um score (apenas exemplo básico, não inclui treinamento de modelo real)
        return scoreService.save(score);
    }
}
