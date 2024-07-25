package org.framework.rodolfo.freire.git.asuna.score.k.nearest.neighbors.service;

import org.framework.rodolfo.freire.git.asuna.score.k.nearest.neighbors.model.Score;
import org.springframework.stereotype.Service;

@Service
public class KNNService {

    // Método para classificação usando K-Nearest Neighbors (KNN)
    public Score classifyRisk(Score score) {
        // Lógica para classificação de risco utilizando KNN
        // Implementação simplificada para ilustração

        // Suponha que temos um conjunto de dados de treinamento já populado no banco de dados
        // Aqui, usaremos uma implementação fictícia de KNN

        // Suponha que estamos usando K = 3 para classificar
        int k = 3;
        String riskCategory = classify(score, k);

        score.setRiskCategory(riskCategory);

        // Salva a categoria de risco calculada no banco de dados
        return score;
    }

    // Método fictício para ilustrar a classificação com KNN
    private String classify(Score score, int k) {
        // Implementação simplificada para ilustração
        // Aqui, a classificação é baseada na distância euclidiana dos atributos

        // Suponha que temos exemplos de treinamento fictícios
        Score[] trainingData = getTrainingData();

        // Calcula a distância euclidiana entre o score a ser classificado e cada exemplo de treinamento
        double[] distances = new double[trainingData.length];
        for (int i = 0; i < trainingData.length; i++) {
            Score trainingExample = trainingData[i];
            distances[i] = calculateEuclideanDistance(score, trainingExample);
        }

        // Obtém os índices dos k vizinhos mais próximos
        int[] nearestIndices = getNearestIndices(distances, k);

        // Conta a frequência das classes dos vizinhos mais próximos
        int lowRiskCount = 0;
        int highRiskCount = 0;
        for (int index : nearestIndices) {
            if (trainingData[index].getRiskCategory().equals("Baixo Risco")) {
                lowRiskCount++;
            } else {
                highRiskCount++;
            }
        }

        // Retorna a classe com maior frequência
        if (lowRiskCount > highRiskCount) {
            return "Baixo Risco";
        } else {
            return "Alto Risco";
        }
    }

    // Método fictício para calcular a distância euclidiana entre dois scores
    private double calculateEuclideanDistance(Score score1, Score score2) {
        // Implementação simplificada para ilustração
        double distance = Math.sqrt(Math.pow(score1.getIncome() - score2.getIncome(), 2)
                + Math.pow(score1.getAge() - score2.getAge(), 2)
                + Math.pow(score1.getCreditHistory() - score2.getCreditHistory(), 2));
        return distance;
    }

    // Método fictício para obter dados de treinamento (exemplos fictícios)
    private Score[] getTrainingData() {
        // Implementação simplificada para ilustração
        // Suponha que temos dados de treinamento populados no banco de dados
        // Aqui, retornamos exemplos fictícios
        Score[] trainingData = new Score[3];
        trainingData[0] = new Score(1L, 5000.0, 30, 0.7, "Baixo Risco");
        trainingData[1] = new Score(2L, 3000.0, 25, 0.5, "Baixo Risco");
        trainingData[2] = new Score(3L, 7000.0, 40, 0.9, "Alto Risco");
        return trainingData;
    }

    // Método fictício para obter os índices dos k vizinhos mais próximos
    private int[] getNearestIndices(double[] distances, int k) {
        // Implementação simplificada para ilustração
        // Aqui, estamos retornando índices aleatórios apenas para fins de exemplo
        int[] nearestIndices = new int[k];
        for (int i = 0; i < k; i++) {
            nearestIndices[i] = i; // Índices aleatórios, idealmente seriam calculados com base nas menores distâncias
        }
        return nearestIndices;
    }
}
