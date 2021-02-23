package demo.srammy.springbootpagehelper.controller;

import com.github.pagehelper.PageInfo;
import demo.srammy.springbootpagehelper.model.User;
import demo.srammy.springbootpagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public PageInfo<User> getAllUsers(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        return userService.getAllUsers(page, size);
    }

}
