package demo.srammy.mybatismultisources.Controller;

import demo.srammy.mybatismultisources.db1.service.UserService;
import demo.srammy.mybatismultisources.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/finduser/{id}")
    public User findUserById(@PathVariable(name = "id" ) Integer id) {
        return userService.findUserById(id);
    }
}
