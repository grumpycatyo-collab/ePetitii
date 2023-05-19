package func;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
@SpringBootApplication
public class app {
    private final UserService userService;

    public app(UserService userService) {
        this.userService = userService;
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(app.class, args);
        UserService userService = context.getBean(UserService.class);
        List<User> users = userService.getAllUsers();
        for (User user : users){

        }

        // Close the application context
        context.close();

    }
}
