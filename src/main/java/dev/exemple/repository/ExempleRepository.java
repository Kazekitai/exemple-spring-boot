package dev.exemple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.exemple.entity.Exemple;

/**
 * Repository pour l'entité Exemple
 * @author Sandra Le Thiec
 *
 */
@Repository
@Transactional
public interface ExempleRepository extends JpaRepository<Exemple, Integer> {

}
