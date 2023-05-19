package func;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

public class main {
    private final UserService userService;

    public main(UserService userService) {
        this.userService = userService;
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(main.class, args);
        UserService userService = context.getBean(UserService.class);
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            // Do something with the user data
            System.out.println("User ID: " + user.getId());
            System.out.println("User Name: " + user.getName());
            // ... Process other user properties
        }

        // Close the application context
        context.close();

    }
}
