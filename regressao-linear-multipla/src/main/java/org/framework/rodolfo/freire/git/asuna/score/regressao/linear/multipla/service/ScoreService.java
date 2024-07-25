package org.framework.rodolfo.freire.git.asuna.score.regressao.linear.multipla.service;

import org.framework.rodolfo.freire.git.asuna.score.regressao.linear.multipla.model.Score;
import org.framework.rodolfo.freire.git.asuna.score.regressao.linear.multipla.repository.ScoreRepository;
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

    // Método para calcular o score utilizando regressão linear múltipla
    public Score calculateScore(Score score) {
        // Lógica para regressão linear múltipla
        // Suponha que estamos calculando o score com base na renda, idade e histórico de crédito
        double[] coefficients = {0.5, -0.2, 0.8}; // Coeficientes para exemplo

        double predictedScore = coefficients[0] * score.getIncome() +
                coefficients[1] * score.getAge() +
                coefficients[2] * score.getCreditHistory();

        score.setScore(predictedScore);

        // Salva o score calculado no banco de dados
        return scoreRepository.save(score);
    }
}
