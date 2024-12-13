package tn.esprit.evenement_categoriemicroservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.evenement_categoriemicroservice.entities.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {}

