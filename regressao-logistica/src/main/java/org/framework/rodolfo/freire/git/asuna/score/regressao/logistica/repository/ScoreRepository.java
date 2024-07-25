package org.framework.rodolfo.freire.git.asuna.score.regressao.logistica.repository;


import org.framework.rodolfo.freire.git.asuna.score.regressao.logistica.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {

}
