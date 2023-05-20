package func;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetitionService {
    private final PetitionRepository petitionRepository;


    public PetitionService(PetitionRepository petitionRepository) {
        this.petitionRepository = petitionRepository;
    }

    public List<Petitie> getAllPetitions() {
        return petitionRepository.findAll();
    }

    public Optional<Petitie> getPetitionById(int id) {
        return petitionRepository.findById(id);
    }
    public void insertData(Petitie entity) {
        petitionRepository.save(entity);
    }
    public void updateData(int entityId, String semnat ) {
        // Retrieve the entity to update
        Petitie entity = petitionRepository.findById(entityId).orElse(null);

        if (entity != null) {
            // Update the desired property
            entity.setSemnat(entity.getSemnat() + "," + semnat);
            entity.setNrSign(entity.getNrSign() + 1);
            // Save the updated entity
            petitionRepository.save(entity);
        }
    }

    public List<Petitie> searchByName(String name) {
        return petitionRepository.findByNameContaining(name);
    }

}
