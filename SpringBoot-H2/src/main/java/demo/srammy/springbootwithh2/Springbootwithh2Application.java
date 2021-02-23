package demo.srammy.springbootwithh2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.srammy.springbootwithh2.dao")
public class Springbootwithh2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootwithh2Application.class, args);
    }

}
