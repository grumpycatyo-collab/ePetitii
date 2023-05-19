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
        System.out.println(petitionService.getAllPetitions());

        // Close the application context
        context.close();

    }
}
