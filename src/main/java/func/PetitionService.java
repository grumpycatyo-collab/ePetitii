package func;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetitionService {
    private final PetitionRepository petitionRepository;


    public PetitionService(PetitionRepository petitionRepository) {
        this.petitionRepository = petitionRepository;
    }

    public List<Petitie> getAllPetitions() {
        return petitionRepository.findAll();
    }
    public void insertData(Petitie entity) {
        petitionRepository.save(entity);
    }
}
