package demo.srammy.readproperties.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "message")
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
