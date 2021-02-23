package demo.srammy.selectkey.dao;

import demo.srammy.selectkey.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    long save(@Param("user") User user);
}
