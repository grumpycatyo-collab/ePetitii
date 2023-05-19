package func;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SemnatEndpoint {

    @GetMapping("/semnat")
    public List<String> getSemnat() {
        Petitie petitie = new Petitie();
        return Arrays.stream(petitie.getSemnat().split(",")).toList();
    }
}