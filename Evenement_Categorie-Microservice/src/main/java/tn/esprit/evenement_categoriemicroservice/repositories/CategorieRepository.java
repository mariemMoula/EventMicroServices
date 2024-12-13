package tn.esprit.evenement_categoriemicroservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.evenement_categoriemicroservice.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {}

