package demo.srammy.mybatismultisources.db2.service;

import demo.srammy.mybatismultisources.db2.dao.DepartmentDao;
import demo.srammy.mybatismultisources.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    public Department getDepartmentNameByDepartmentno(int departmentNo) {
        Department department = departmentDao.getDepartmentNameByDepartmentno(departmentNo);
        return department;
    }
}
