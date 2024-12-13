package controllers;

import Repository.InternauteRepository;
import entities.Internaute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.InternauteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/internautes")
public class InternauteController {

    @Autowired
    private InternauteService internauteService;

    @PostMapping
    public Internaute ajouterInternaute(@RequestBody Internaute internaute) {
        return internauteService.ajouterInternaute(internaute);
    }

    @GetMapping("/{id}")
    public Optional<Internaute> obtenirInternauteParId(@PathVariable Long id) {
        return internauteService.obtenirInternauteParId(id);
    }

    @GetMapping
    public List<Internaute> obtenirTousLesInternautes() {
        return internauteService.obtenirTousLesInternautes();
    }

    @PutMapping("/{id}")
    public Internaute mettreAJourInternaute(@PathVariable Long id, @RequestBody Internaute internaute) {
        return internauteService.mettreAJourInternaute(id, internaute);
    }

    @DeleteMapping("/{id}")
    public void supprimerInternaute(@PathVariable Long id) {
        internauteService.supprimerInternaute(id);
    }
}
