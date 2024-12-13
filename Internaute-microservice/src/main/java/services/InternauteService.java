package services;

import entities.Internaute;
import java.util.List;
import java.util.Optional;

public interface InternauteService {
    Internaute ajouterInternaute(Internaute internaute);
    Optional<Internaute> obtenirInternauteParId(Long id);
    List<Internaute> obtenirTousLesInternautes();
    Internaute mettreAJourInternaute(Long id, Internaute internaute);
    void supprimerInternaute(Long id);
}