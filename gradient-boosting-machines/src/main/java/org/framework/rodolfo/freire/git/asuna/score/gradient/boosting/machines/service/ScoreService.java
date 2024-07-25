package org.framework.rodolfo.freire.git.asuna.score.gradient.boosting.machines.service;


import org.framework.rodolfo.freire.git.asuna.score.gradient.boosting.machines.model.Score;
import org.framework.rodolfo.freire.git.asuna.score.gradient.boosting.machines.repository.ScoreRepository;
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
