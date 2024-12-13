// Evenement_Categorie-Microservice/src/main/java/tn/esprit/evenement_categoriemicroservice/services/EvenementServiceImpl.java
package tn.esprit.evenement_categoriemicroservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.evenement_categoriemicroservice.entities.Categorie;
import tn.esprit.evenement_categoriemicroservice.entities.Evenement;
import tn.esprit.evenement_categoriemicroservice.repositories.CategorieRepository;
import tn.esprit.evenement_categoriemicroservice.repositories.EvenementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EvenementServiceImpl implements EvenementService {

    @Autowired
    private EvenementRepository evenementRepository;
    @Autowired
    private CategorieRepository categorieRepository;
    @Autowired
    private CategorieServiceImpl categorieServiceImpl;

    @Override
    public Evenement ajouterEvenement(Evenement evenement) {
        List<Categorie> categories = evenement.getCategories();
        for (Categorie categorie : categories) {
            categorieRepository.save(categorie);
            categorie.getEvenements().add(evenement);
        }
        return evenementRepository.save(evenement);
    }

    @Override
    public Optional<Evenement> obtenirEvenementParId(Long id) {
        return evenementRepository.findById(id);
    }

    @Override
    public List<Evenement> obtenirTousLesEvenements() {
        return evenementRepository.findAll();
    }

    @Override
    public Evenement mettreAJourEvenement(Long id, Evenement evenement) {
        if (evenementRepository.existsById(id)) {
            evenement.setIdEvenement(id);

            List<Categorie> categories = evenement.getCategories();
            for (Categorie categorie : categories) {
                categorieServiceImpl.mettreAJourCategorie(categorie.getIdCategorie(), categorie);
            }

            return evenementRepository.save(evenement);
        }
        return null;
    }

    @Override
    public void supprimerEvenement(Long id) {
        evenementRepository.deleteById(id);
    }
}