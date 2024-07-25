package org.framework.rodolfo.freire.git.asuna.score.maquina.vetores.suporte.service;


import org.framework.rodolfo.freire.git.asuna.score.maquina.vetores.suporte.model.Score;
import org.framework.rodolfo.freire.git.asuna.score.maquina.vetores.suporte.repository.ScoreRepository;
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
