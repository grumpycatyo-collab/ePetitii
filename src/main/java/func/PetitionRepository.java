package func;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PetitionRepository extends JpaRepository<Petitie, Long> {

}
