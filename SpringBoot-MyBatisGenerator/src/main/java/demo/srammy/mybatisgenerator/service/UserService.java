package demo.srammy.mybatisgenerator.service;

import demo.srammy.mybatisgenerator.dao.UserMapper;
import demo.srammy.mybatisgenerator.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public User findUserById(int userId) {
        User user = userMapper.findUserById(userId);
        return user;
    }
}
