package func;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
@SpringBootApplication
public class app {
    private final PetitionService petitionService;

    public app(PetitionService petitionService){
        this.petitionService = petitionService;
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(app.class, args);
        PetitionService petitionService = context.getBean(PetitionService.class);
        List<Petitie> petitions = petitionService.getAllPetitions();
        for (Petitie petition : petitions){
            System.out.println(petition.toString());
        }

        // Close the application context
        context.close();

    }
}
