package demo.srammy.mybatismultisources.db1.dao;

import demo.srammy.mybatismultisources.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Qualifier("db1SqlSessionTemplate")
@Repository
public interface UserDao {
    List<User> getAllUsers();
    User findUserById(@Param("userId") int userId);
}
