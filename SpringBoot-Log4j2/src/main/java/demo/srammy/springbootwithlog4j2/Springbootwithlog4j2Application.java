package demo.srammy.springbootwithlog4j2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.srammy.springbootwithlog4j2.dao")
public class Springbootwithlog4j2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootwithlog4j2Application.class, args);
    }

}
