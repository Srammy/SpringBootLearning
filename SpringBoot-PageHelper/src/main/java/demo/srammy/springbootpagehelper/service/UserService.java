package demo.srammy.springbootpagehelper.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import demo.srammy.springbootpagehelper.dao.UserDao;
import demo.srammy.springbootpagehelper.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     *
     * @param page 页码
     * @param size 每页记录数
     * @return
     */
    public PageInfo<User> getAllUsers(Integer page, Integer size) {
        //开启分页查询，写在查询语句上方
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页。
        PageHelper.startPage(page, size);
        List<User> users = userDao.getAllUsers();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }
}
