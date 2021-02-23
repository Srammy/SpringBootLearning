package demo.srammy.springboottomcat.dao;

import demo.srammy.springboottomcat.model.User;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Repository
public interface UserDao {
    List<User> getAllUsers();
    User findUserById(@Param("userId") Integer userId);
}
