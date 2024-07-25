package org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.service;

import org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.model.PCAData;
import org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.repository.PCADataRepository;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    private final PCADataRepository scoreRepository;

    public ScoreService(PCADataRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    // Método para salvar um score
    public PCAData save(PCAData score) {
        return scoreRepository.save(score);
    }
}
