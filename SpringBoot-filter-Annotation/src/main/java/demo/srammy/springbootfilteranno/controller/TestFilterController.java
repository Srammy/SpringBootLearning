package demo.srammy.springbootfilteranno.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFilterController {

    @GetMapping("/user/getAllUsers")
    public String getAllUsers() {
        System.out.println("获取所有User");
        return "allUser";
    }

    @GetMapping("/department/getAllDepartment")
    public void getAllDepartment() {
        System.out.println("获取所有Department");
    }

    @GetMapping("/department/geDepartmenttById")
    public void geDepartmenttById() {
        System.out.println("根据id获取department");
    }
}
