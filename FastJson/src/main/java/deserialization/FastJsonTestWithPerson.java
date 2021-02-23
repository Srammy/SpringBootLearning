package deserialization;

import com.alibaba.fastjson.JSON;
import deserialization.Person;

import java.util.Date;

public class FastJsonTestWithPerson {
    public static void main(String[] args) {
        deserialization.Person person = new Person();
        person.setAge(30);
        person.setBirthDay(new Date());
        person.setUserName("Yahaha");
        person.setPassword("#$%@123");

        // 转为json串
        String jsonOutput1 = JSON.toJSONString(person);
        System.out.println(jsonOutput1);

        // 转为Java对象
        Person newPerson = JSON.parseObject(jsonOutput1, deserialization.Person.class);
        System.out.println(newPerson);
    }
}
