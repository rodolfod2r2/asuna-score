package org.framework.rodolfo.freire.git.asuna.score.k.nearest.neighbors.repository;


import org.framework.rodolfo.freire.git.asuna.score.k.nearest.neighbors.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
}
