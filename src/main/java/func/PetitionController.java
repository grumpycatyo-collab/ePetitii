package func;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/petitii")
public class PetitionController {
    private final PetitionService petitionService;

    public PetitionController(PetitionService petitionService) {this.petitionService = petitionService;}

    @GetMapping
    public List<Petitie> getPetitions() {
        return petitionService.getAllPetitions();
    }
    @PostMapping("/add")
    public String createPetition(@RequestBody Petitie request) {
        String title = request.getName();
        String description = request.getContent();
        // Get other fields from the request and set them accordingly

        // Create a new Petition object
        Petitie petition = new Petitie();
        petition.setName(title);
        petition.setContent(description);
        // Set other fields of the Petition object

        // Process and save the petition object in the database or perform other operations

        return "Petition created successfully";
    }
}
