package org.framework.rodolfo.freire.git.asuna.score.regressao.logistica.service;

import org.framework.rodolfo.freire.git.asuna.score.regressao.logistica.model.Score;
import org.framework.rodolfo.freire.git.asuna.score.regressao.logistica.repository.ScoreRepository;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    private final ScoreRepository scoreRepository;

    public ScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    // Método para salvar um score
    public Score save(Score score) {
        return scoreRepository.save(score);
    }

}
