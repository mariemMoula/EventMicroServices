// Evenement_Categorie-Microservice/src/main/java/tn/esprit/evenement_categoriemicroservice/controllers/CategorieController.java
package tn.esprit.evenement_categoriemicroservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.evenement_categoriemicroservice.entities.Categorie;
import tn.esprit.evenement_categoriemicroservice.services.CategorieService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @PostMapping
    public Categorie ajouterCategorie(@RequestBody Categorie categorie) {
        return categorieService.ajouterCategorie(categorie);
    }

    @GetMapping("/{id}")
    public Optional<Categorie> obtenirCategorieParId(@PathVariable Long id) {
        return categorieService.obtenirCategorieParId(id);
    }

    @GetMapping
    public List<Categorie> obtenirToutesLesCategories() {
        return categorieService.obtenirToutesLesCategories();
    }

    @PutMapping("/{id}")
    public Categorie mettreAJourCategorie(@PathVariable Long id, @RequestBody Categorie categorie) {
        return categorieService.mettreAJourCategorie(id, categorie);
    }

    @DeleteMapping("/{id}")
    public void supprimerCategorie(@PathVariable Long id) {
        categorieService.supprimerCategorie(id);
    }
}