package tn.esprit.evenement_categoriemicroservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvenement;

    private String nom;
    private String description;
    private Double prix;

    @ManyToMany
    @JoinTable(
            name = "evenement_categorie",
            joinColumns = @JoinColumn(name = "id_evenement"),
            inverseJoinColumns = @JoinColumn(name = "id_categorie")
    )
    private List<Categorie> categories = new ArrayList<>();
}
