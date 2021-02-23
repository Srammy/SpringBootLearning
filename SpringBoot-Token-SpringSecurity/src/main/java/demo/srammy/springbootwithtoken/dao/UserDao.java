package demo.srammy.springbootwithtoken.dao;

import demo.srammy.springbootwithtoken.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> getAllUsers();
    User findUserById(@Param("userId") Integer userId);
}
