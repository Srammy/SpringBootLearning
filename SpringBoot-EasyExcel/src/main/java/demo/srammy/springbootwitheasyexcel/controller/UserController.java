package demo.srammy.springbootwitheasyexcel.controller;

import demo.srammy.springbootwitheasyexcel.model.User;
import demo.srammy.springbootwitheasyexcel.service.UserService;
import demo.srammy.springbootwitheasyexcel.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/finduser/{id}")
    public User findUserById(@PathVariable(name = "id" ) Integer id) {
        return userService.findUserById(id);
    }

    @GetMapping(value = "/exportUserInfo")
    public void exportDeviceInfo(HttpServletResponse response) throws IOException {
        response.setContentType("multipart/form-data");
        response.setHeader("content-type", "application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode("测试生成Excel文件.xlsx", "utf-8"));
        OutputStream outputStream = response.getOutputStream();
        ExcelUtils.writeWithTemplate(userService.getAllUsersByExcel(), outputStream);
    }
}
