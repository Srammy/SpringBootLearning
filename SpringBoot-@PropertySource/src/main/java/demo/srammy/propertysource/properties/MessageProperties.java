package demo.srammy.propertysource.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component    // 注册为一个Spring组件。供后面注入使用。
@ConfigurationProperties(prefix = "message")   // 读取配置文件。将配置文件与改类的属性绑定。
@PropertySource(value = {"classpath:message.properties"})    // 指定配置文件的位置
public class MessageProperties {
    private String name;
    private int number;
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MessageProperties{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", title='" + title + '\'' +
                '}';
    }
}
