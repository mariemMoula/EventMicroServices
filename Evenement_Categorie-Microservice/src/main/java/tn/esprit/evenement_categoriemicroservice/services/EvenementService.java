// Evenement_Categorie-Microservice/src/main/java/tn/esprit/evenement_categoriemicroservice/services/EvenementService.java
package tn.esprit.evenement_categoriemicroservice.services;

import tn.esprit.evenement_categoriemicroservice.entities.Evenement;
import java.util.List;
import java.util.Optional;

public interface EvenementService {
    Evenement ajouterEvenement(Evenement evenement);
    Optional<Evenement> obtenirEvenementParId(Long id);
    List<Evenement> obtenirTousLesEvenements();
    Evenement mettreAJourEvenement(Long id, Evenement evenement);
    void supprimerEvenement(Long id);
}