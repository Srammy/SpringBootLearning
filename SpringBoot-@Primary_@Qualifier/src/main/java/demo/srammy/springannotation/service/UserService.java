package demo.srammy.springannotation.service;

import demo.srammy.springannotation.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User findUserById(int userId);
}
