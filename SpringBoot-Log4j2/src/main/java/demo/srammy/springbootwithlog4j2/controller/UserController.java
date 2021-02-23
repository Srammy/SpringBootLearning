package demo.srammy.springbootwithlog4j2.controller;

import demo.srammy.springbootwithlog4j2.model.User;
import demo.srammy.springbootwithlog4j2.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        logger.info("查询所有用户");
        int i = 1/0;
        return userService.getAllUsers();
    }

    @GetMapping(value = "/finduser/{id}")
    public User findUserById(@PathVariable(name = "id" ) Integer id) {
        logger.info("根据id查询用户");
        return userService.findUserById(id);
    }

}
