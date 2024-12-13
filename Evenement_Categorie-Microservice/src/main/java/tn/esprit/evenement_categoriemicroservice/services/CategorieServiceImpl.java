// Evenement_Categorie-Microservice/src/main/java/tn/esprit/evenement_categoriemicroservice/services/CategorieServiceImpl.java
package tn.esprit.evenement_categoriemicroservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.evenement_categoriemicroservice.entities.Categorie;
import tn.esprit.evenement_categoriemicroservice.repositories.CategorieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public Categorie ajouterCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public Optional<Categorie> obtenirCategorieParId(Long id) {
        return categorieRepository.findById(id);
    }

    @Override
    public List<Categorie> obtenirToutesLesCategories() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie mettreAJourCategorie(Long id, Categorie categorie) {
        if (categorieRepository.existsById(id)) {
            categorie.setIdCategorie(id);
            return categorieRepository.save(categorie);
        }
        return null;
    }

    @Override
    public void supprimerCategorie(Long id) {
        categorieRepository.deleteById(id);
    }
}