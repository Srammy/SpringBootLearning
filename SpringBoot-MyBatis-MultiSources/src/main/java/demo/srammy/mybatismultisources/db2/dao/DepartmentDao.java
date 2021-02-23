package demo.srammy.mybatismultisources.db2.dao;

import demo.srammy.mybatismultisources.model.Department;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Qualifier("db2SqlSessionTemplate")
@Repository
public interface DepartmentDao {
    Department getDepartmentNameByDepartmentno(@Param("departmentNo") int departmentNo);
}
