package deserialization;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Person {
    @JSONField(name = "AGE", ordinal = 3)
    private int age;

    @JSONField(name = "USERNAME", serialize = false)
    private String userName;

    @JSONField(name = "PASSWORD", ordinal = 1)
    private String password;

    @JSONField(name = "BirthDAY", format = "dd/MM/yyyy", ordinal = 2, deserialize = false)
    private Date birthDay;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
