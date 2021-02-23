package demo.srammy.exceptionhandler.controller;

import demo.srammy.exceptionhandler.exception.CustomException;
import demo.srammy.exceptionhandler.exception.MissQueryParameterException;
import demo.srammy.exceptionhandler.model.User;
import demo.srammy.exceptionhandler.service.UserService;
import demo.srammy.exceptionhandler.vo.ResponseCode;
import demo.srammy.exceptionhandler.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        throw new CustomException(new ResponseVo().setResponseCode(ResponseCode.NOT_SUPPORT.code()).setResponseMessage("请求错误"));
//        return userService.getAllUsers();
    }

    @GetMapping(value = "/finduser")
    public User findUserById(@RequestParam Integer id) {
        if (id == null) throw new MissQueryParameterException(new ResponseVo().setResponseCode(ResponseCode.MISS_PARAM.code()).setResponseMessage("缺少参数"));
        return userService.findUserById(id);
    }

}
