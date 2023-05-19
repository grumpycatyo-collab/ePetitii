package func;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import java.util.List;
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
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


    }
}
