package demo.srammy.springbootwitheasyexcel.service;

import demo.srammy.springbootwitheasyexcel.dao.UserDao;
import demo.srammy.springbootwitheasyexcel.excel.UserExcelModel;
import demo.srammy.springbootwitheasyexcel.model.User;
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

    public List<UserExcelModel> getAllUsersByExcel() {
        return userDao.getAllUsersByExcel();
    }
}
