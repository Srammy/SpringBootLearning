package demo.srammy.mapperandrepository.dao;

import demo.srammy.mapperandrepository.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//@Repository
@Mapper
public interface UserDao {
    long save(@Param("user") User user);
}
