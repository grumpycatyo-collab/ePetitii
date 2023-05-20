package func;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
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

    @GetMapping
    public List<String> getSemnat() {
        List<Petitie> petitieList = petitionRepositor.findAll();
        return petitieList.stream().map(Petitie::getSemnat).collect(Collectors.toList());
    }
}
