package demo.srammy.selectkey;

import demo.srammy.selectkey.dao.UserDao;
import demo.srammy.selectkey.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectkeyApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setUsername("bbb");
        user.setPassword("iuiuiui");
        System.out.println(userDao.save(user));
        System.out.println(user.getUserId());
    }

}
