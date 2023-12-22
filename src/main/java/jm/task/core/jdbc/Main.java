package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Japar", "Tohir Uulu", (byte)24);
        userService.saveUser("Aibek", "Akynbekov", (byte)27);
        userService.saveUser("Aktilek", "Kanybekov", (byte)24);
        userService.saveUser("Nukush", "Kanybekov", (byte)15);

        List<User> users = userService.getAllUsers();
        for (User user: users)
            System.out.println(user);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
