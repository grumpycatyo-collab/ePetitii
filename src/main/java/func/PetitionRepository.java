package func;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PetitionRepository extends JpaRepository<Petitie, Integer> {
    List<Petitie> findByNameContaining(String name);
}
