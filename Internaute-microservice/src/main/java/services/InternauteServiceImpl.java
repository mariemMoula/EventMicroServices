// Internaute/src/main/java/services/InternauteServiceImpl.java
package services;

import Repository.InternauteRepository;
import entities.Internaute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternauteServiceImpl implements InternauteService {

    @Autowired
    private InternauteRepository internauteRepository;

    @Override
    public Internaute ajouterInternaute(Internaute internaute) {
        return internauteRepository.save(internaute);
    }

    @Override
    public Optional<Internaute> obtenirInternauteParId(Long id) {
        return internauteRepository.findById(id);
    }

    @Override
    public List<Internaute> obtenirTousLesInternautes() {
        return internauteRepository.findAll();
    }

    @Override
    public Internaute mettreAJourInternaute(Long id, Internaute internaute) {
        if (internauteRepository.existsById(id)) {
            internaute.setIdInternaute(id);
            return internauteRepository.save(internaute);
        }
        return null;
    }

    @Override
    public void supprimerInternaute(Long id) {
        internauteRepository.deleteById(id);
    }
}