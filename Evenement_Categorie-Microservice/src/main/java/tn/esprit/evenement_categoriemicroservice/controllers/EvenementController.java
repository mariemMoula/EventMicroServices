// Evenement_Categorie-Microservice/src/main/java/tn/esprit/evenement_categoriemicroservice/controllers/EvenementController.java
package tn.esprit.evenement_categoriemicroservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.evenement_categoriemicroservice.entities.Evenement;
import tn.esprit.evenement_categoriemicroservice.services.EvenementService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/evenements")
public class EvenementController {

    @Autowired
    private EvenementService evenementService;

    @PostMapping
    public Evenement ajouterEvenement(@RequestBody Evenement evenement) {
        return evenementService.ajouterEvenement(evenement);
    }

    @GetMapping("/{id}")
    public Optional<Evenement> obtenirEvenementParId(@PathVariable Long id) {
        return evenementService.obtenirEvenementParId(id);
    }

    @GetMapping
    public List<Evenement> obtenirTousLesEvenements() {
        return evenementService.obtenirTousLesEvenements();
    }

    @PutMapping("/{id}")
    public Evenement mettreAJourEvenement(@PathVariable Long id, @RequestBody Evenement evenement) {
        return evenementService.mettreAJourEvenement(id, evenement);
    }

    @DeleteMapping("/{id}")
    public void supprimerEvenement(@PathVariable Long id) {
        evenementService.supprimerEvenement(id);
    }
}