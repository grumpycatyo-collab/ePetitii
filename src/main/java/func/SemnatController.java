package func;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@RestController
//@Qualifier("DataSource")
@RequestMapping("/api/semnat")
public class SemnatController {

    private final PetitionRepository petitionRepositor;

    @Autowired
    public SemnatController(PetitionRepository petitionRepositor) {
        this.petitionRepositor = petitionRepositor;
    }

    @GetMapping("/{id}")
    public String[] getSemnatById(@PathVariable int id) {
        Optional<Petitie> petitieOptional = petitionRepositor.findById(id);
        if (petitieOptional.isPresent()) {
            Petitie petitie = petitieOptional.get();
            String[] semnatari = petitie.getSemnat().split(",");
            return semnatari;
        }
        throw new NoSuchElementException("Petitie with ID " + id + " not found");
    }
}
