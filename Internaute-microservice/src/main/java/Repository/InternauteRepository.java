package Repository;

import entities.Internaute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternauteRepository extends JpaRepository<Internaute, Long> {}

