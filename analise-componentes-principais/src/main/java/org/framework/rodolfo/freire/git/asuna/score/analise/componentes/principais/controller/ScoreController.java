package org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.controller;


import org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.model.PCAData;
import org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.service.PCAService;
import org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/score")
public class ScoreController {

    private final ScoreService scoreService;

    private final PCAService pcaService;

    public ScoreController(ScoreService scoreService, PCAService pcaService) {
        this.scoreService = scoreService;
        this.pcaService = pcaService;
    }

    @PostMapping("/transform")
    public PCAData transformWithPCA(@RequestBody PCAData pcaData) {
        // Chama o serviço para realizar a transformação PCA
        return pcaService.performPCA(pcaData);
    }

    @PostMapping("/train")
    public PCAData trainScoreModel(@RequestBody PCAData score) {
        // Chama o serviço para salvar um score (apenas exemplo básico, não inclui treinamento de modelo real)
        return scoreService.save(score);
    }
}
