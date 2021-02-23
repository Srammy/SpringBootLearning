package demo.srammy.springbootpagehelper.dao;

import demo.srammy.springbootpagehelper.model.User;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Repository
public interface UserDao {
    List<User> getAllUsers();
}
