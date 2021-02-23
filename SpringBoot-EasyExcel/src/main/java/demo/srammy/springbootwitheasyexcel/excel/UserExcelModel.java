package demo.srammy.springbootwitheasyexcel.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.util.Objects;

public class UserExcelModel extends BaseRowModel {

    /**
     * value: 表头名称
     * index: 列的号, 0表示第一列
     */
    @ExcelProperty(value = "用户id", index = 0)
    private int id;

    @ExcelProperty(value = "用户名",index = 1)
    private String userName;

    @ExcelProperty(value = "用户密码",index = 2)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserExcelModel that = (UserExcelModel) o;
        return id == that.id &&
                userName.equals(that.userName) &&
                password.equals(that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, password);
    }
}
