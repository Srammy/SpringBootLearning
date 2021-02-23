package demo.srammy.springbootwitheasyexcel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.srammy.springbootwitheasyexcel.dao")
public class SpringbootwitheasyexcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwitheasyexcelApplication.class, args);
    }

}
