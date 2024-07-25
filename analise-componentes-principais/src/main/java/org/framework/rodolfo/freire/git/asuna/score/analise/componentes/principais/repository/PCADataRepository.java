package org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.repository;


import org.framework.rodolfo.freire.git.asuna.score.analise.componentes.principais.model.PCAData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PCADataRepository extends JpaRepository<PCAData, Long> {
}
