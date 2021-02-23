package demo.srammy.springannotation.service;

import demo.srammy.springannotation.dao.UserDao;
import demo.srammy.springannotation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl2 implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User findUserById(int userId) {
        User user = userDao.findUserById(userId);
        return user;
    }
}
