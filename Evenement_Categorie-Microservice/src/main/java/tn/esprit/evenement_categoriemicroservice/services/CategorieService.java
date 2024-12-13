package tn.esprit.evenement_categoriemicroservice.services;

import tn.esprit.evenement_categoriemicroservice.entities.Categorie;
import java.util.List;
import java.util.Optional;

public interface CategorieService {
    Categorie ajouterCategorie(Categorie categorie);

    Optional<Categorie> obtenirCategorieParId(Long id);

    List<Categorie> obtenirToutesLesCategories();

    Categorie mettreAJourCategorie(Long id, Categorie categorie);
    void supprimerCategorie(Long id);

}