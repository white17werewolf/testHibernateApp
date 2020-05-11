import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args)  {

        UserService userService = new UserService();
        User user = new User("Marina",23);
        userService.saveUser(user);
        Auto ferrari = new Auto("BMW", "black");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "red");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);

        User user2 = new User("Kirill",23);
        userService.saveUser(user2);
        Auto tesla = new Auto("Tesla", "white");
        ferrari.setUser(user2);
        user.addAuto(tesla);
        userService.updateUser(user2);

        user2.setName("Vladimir");
        userService.updateUser(user2);

        userService.deleteUser(user2);
    }
}