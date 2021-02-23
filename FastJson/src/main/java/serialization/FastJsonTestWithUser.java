package serialization;

import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FastJsonTestWithUser {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(23);
        user1.setUserName("Srammy");
        user1.setBirthDay(new Date());

        User user2 = new User();
        user2.setAge(23);
        user2.setUserName("Srammy");
        user2.setBirthDay(new Date());

        String jsonOutput1 = JSON.toJSONString(user2);
        System.out.println(jsonOutput1);

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        String jsonOutput2 = JSON.toJSONString(userList);
        System.out.println(jsonOutput2);
    }
}
