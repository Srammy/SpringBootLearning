package demo.srammy.mapperandrepository;

import demo.srammy.mapperandrepository.dao.UserDao;
import demo.srammy.mapperandrepository.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperandrepositoryApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setUsername("mmm");
        user.setPassword("ppppp");
        System.out.println(userDao.save(user));
        System.out.println(user.getUserId());
    }

}
