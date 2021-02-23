package demo.srammy.propertysource;

import demo.srammy.propertysource.properties.MessageProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertysourceApplicationTests {

    @Autowired
    private MessageProperties messageProperties;

    @Test
    public void contextLoads() {
        System.out.println(messageProperties.toString());
    }

}
