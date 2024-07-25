package org.framework.rodolfo.freire.git.asuna.score.arvore.decisao.service;

import org.framework.rodolfo.freire.git.asuna.score.arvore.decisao.model.Score;
import org.springframework.stereotype.Service;

@Service
public class DecisionTreeService {

    // Método para classificação usando Árvore de Decisão (simples exemplo)
    public Score classifyRisk(Score score) {
        // Lógica para classificação de risco utilizando Árvore de Decisão
        // Suponha que estamos classificando o risco com base na renda, idade e histórico de crédito
        // Exemplo simples de regras de classificação
        if (score.getIncome() > 50000 && score.getCreditHistory() >= 0.7) {
            score.setRiskCategory("Baixo Risco");
        } else if (score.getIncome() > 30000 && score.getIncome() <= 50000 && score.getCreditHistory() >= 0.5) {
            score.setRiskCategory("Risco Médio");
        } else {
            score.setRiskCategory("Alto Risco");
        }

        // Salva a categoria de risco calculada no banco de dados
        return score;
    }
}
