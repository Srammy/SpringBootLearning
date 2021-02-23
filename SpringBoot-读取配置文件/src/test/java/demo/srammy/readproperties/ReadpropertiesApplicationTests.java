package demo.srammy.readproperties;

import demo.srammy.readproperties.properties.MessageProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@EnableConfigurationProperties(MessageProperties.class)
public class ReadpropertiesApplicationTests {

    @Autowired
    private MessageProperties messageProperties;

    @Test
    public void contextLoads() {
        System.out.println(messageProperties.toString());
    }

    //--------------方式1：@Value()------------------------
    /*
    @Value("${message.name}")
    String name;

    @Value("${message.number}")
    int number;

    @Value("${message.title}")
    String title;

    @Test
    public void contextLoads() {
        System.out.println(name + number + title);    // 输出：haha1java
    }
    */
}
