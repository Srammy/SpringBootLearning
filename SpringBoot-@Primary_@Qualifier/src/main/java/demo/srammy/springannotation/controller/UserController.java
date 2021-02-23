package demo.srammy.springannotation.controller;

import demo.srammy.springannotation.model.User;
import demo.srammy.springannotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl1")
    private UserService userService;

    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/finduser/{id}")
    public User findUserById(@PathVariable(name = "id" ) Integer id) {
        return userService.findUserById(id);
    }

}
