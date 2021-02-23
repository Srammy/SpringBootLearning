package demo.srammy.springbootwithswagger.controller;

import demo.srammy.springbootwithswagger.model.User;
import demo.srammy.springbootwithswagger.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value ="查询所有用户:/all",notes ="查询所有用户",httpMethod = "GET")
    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @ApiOperation(value ="查找用户:/findUserById",notes ="根据ID查找用户",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户ID",paramType = "query",required = true,dataType = "Integer"),
    })
    @GetMapping(value = "/findUserById")
    public User findUserById(@RequestParam Integer id) {
        return userService.findUserById(id);
    }

}
