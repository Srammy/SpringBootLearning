package demo.srammy.springbootwitheasyexcel.dao;

import demo.srammy.springbootwitheasyexcel.excel.UserExcelModel;
import demo.srammy.springbootwitheasyexcel.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> getAllUsers();
    List<UserExcelModel> getAllUsersByExcel();
    User findUserById(@Param("userId") Integer userId);
}
