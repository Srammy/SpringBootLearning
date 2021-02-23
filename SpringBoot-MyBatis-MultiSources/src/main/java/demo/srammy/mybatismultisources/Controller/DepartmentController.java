package demo.srammy.mybatismultisources.Controller;

import demo.srammy.mybatismultisources.db2.service.DepartmentService;
import demo.srammy.mybatismultisources.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping(value = "/getDepartmentNameByDepartmentno")
    public Department getDepartmentNameByDepartmentno(@RequestParam int departmentNo) {
        Department department = departmentService.getDepartmentNameByDepartmentno(departmentNo);
        return department;
    }
}
