package org.framework.rodolfo.freire.git.asuna.score.redes.neurais.artificiais.repository;


import org.framework.rodolfo.freire.git.asuna.score.redes.neurais.artificiais.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
}
