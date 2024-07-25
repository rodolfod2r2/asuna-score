package org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.service;


import org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.model.PCAData;
import org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.repository.PCADataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PCAService {

    @Autowired
    private PCADataRepository pcaDataRepository;

    // Método para realizar a transformação PCA e salvar os dados
    public PCAData performPCA(PCAData pcaData) {
        // Lógica para realizar a análise de componentes principais (PCA)
        // Aqui, implementaremos uma versão simplificada para ilustração

        // Suponha que estamos fazendo uma transformação simples dos dados originais
        double originalFeature1 = pcaData.getOriginalFeature1();
        double originalFeature2 = pcaData.getOriginalFeature2();

        // Aplicando a transformação PCA simples (exemplo hipotético)
        double pcaComponent = originalFeature1 + originalFeature2; // Exemplo simplificado

        pcaData.setPcaComponent(pcaComponent);

        // Salva os dados transformados no banco de dados
        return pcaDataRepository.save(pcaData);
    }
}
