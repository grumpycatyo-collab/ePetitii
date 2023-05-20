package func;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController

@Qualifier("DataSource")
@RequestMapping("/api/petitii")
public class PetitionController {
    private final PetitionService petitionService;

    public PetitionController(PetitionService petitionService) {this.petitionService = petitionService;}
    @GetMapping("/id/{id}")
    public Petitie getPetition(@PathVariable("id") int id){
        return petitionService.getPetitionById(id).orElse(null);
    }
    @GetMapping
    public List<Petitie> getPetitions() {
        return petitionService.getAllPetitions();
    }
    @PostMapping("/add")
    public String createPetition(@RequestBody Petitie request) {
        List<Petitie> list = getPetitions();
        Petitie petition = new Petitie();
        int id = list.get(list.size() - 1).getId() + 1;
        petition.setId(id);

        String initiator = request.getInitiator();
        petition.setInitiator((initiator));

        String title = request.getName();
        petition.setName(title);
        Date data = request.getDate();
        petition.setDate(data);

        String description = request.getContent();
        petition.setContent(description);

        int nrsign = 1;
        petition.setNrSign(nrsign);

        String towho = request.getToWho();
        petition.setToWho(towho);

        String statut = request.getStatut();
        petition.setStatut(statut);

        String semnat = request.getInitiator() + " ";
        petition.setSemnat(semnat);

        String category = request.getCategory();
        petition.setCategory(category);

        if(towho.equals("Guver") || towho.equals("Parlament") || towho.equals("Presidinte")){
            petition.setNrsignneeded(10000);
        }
        else{
            petition.setNrsignneeded(10000);
        }
        list.add(petition);
        petitionService.insertData(petition);
        return "Petition created successfully";
    }
    @PostMapping("/sign")
    private String signPetition(@RequestBody Petitie request) {
        List<Petitie> list = getPetitions();
        int id = request.getId();
        String semnatPers = request.getSemnat();
        petitionService.updateData(id, semnatPers);
        return "Petition signed successfully";
    }
}
