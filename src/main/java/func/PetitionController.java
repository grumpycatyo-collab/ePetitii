package func;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Petitie")
public class PetitionController {
    private final PetitionService petitionService;

    public PetitionController(PetitionService petitionService) {this.petitionService = petitionService;}

    @GetMapping
    public List<Petitie> getPetitions() {
        return petitionService.getAllPetitions();
    }
}
