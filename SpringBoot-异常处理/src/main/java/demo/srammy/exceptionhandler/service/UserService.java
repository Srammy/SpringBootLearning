package demo.srammy.exceptionhandler.service;

import demo.srammy.exceptionhandler.dao.UserDao;
import demo.srammy.exceptionhandler.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User findUserById(int userId) {
        User user = userDao.findUserById(userId);
        return user;
    }
}
