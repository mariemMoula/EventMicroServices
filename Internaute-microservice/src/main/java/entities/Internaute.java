package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Internaute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInternaute;

    private String identifiant;

    @Enumerated(EnumType.STRING)
    private TrancheAge trancheAge;

    @ElementCollection
    private List<Integer> ticketsId;
}
