package serialization;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class FastJsonTestWithPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(30);
        person.setBirthDay(new Date());
        person.setUserName("Yahaha");
        person.setPassword("#$%@123");

        String jsonOutput1 = JSON.toJSONString(person);
        System.out.println(jsonOutput1);
    }
}
