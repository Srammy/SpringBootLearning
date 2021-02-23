package demo.srammy.springbootwithjpa.controller;

import demo.srammy.springbootwithjpa.dao.UserDao;
import demo.srammy.springbootwithjpa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping(value = "/findUserById")
    public User findUserById(@RequestParam Integer userId) {
        Optional<User> userOptional = userDao.findById(userId);
        return userOptional.get();
    }

    @PostMapping(value = "/saveUser")
    public User saveUser(@RequestParam String userName, @RequestParam String password) {
        User user = new User();
        user.setUsername(userName);
        user.setPassword(password);
        return userDao.save(user);
    }

    @PostMapping(value = "/deleteByUserId")
    public void deleteByUserId(@RequestParam int userId) {
        userDao.deleteById(userId);
    }

    @GetMapping(value = "/findByUsername")
    public User findByUserName(@RequestParam String username) {
        Optional<User> userOptional = userDao.findByUsername(username);
        return userOptional.get();
    }
}
