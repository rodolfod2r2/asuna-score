package org.framework.rodolfo.freire.git.asuna.score.maquina.vetores.suporte.repository;


import org.framework.rodolfo.freire.git.asuna.score.maquina.vetores.suporte.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
}
