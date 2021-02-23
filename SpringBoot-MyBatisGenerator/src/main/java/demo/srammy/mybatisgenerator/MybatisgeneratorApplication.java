package demo.srammy.mybatisgenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.srammy.mybatisgenerator.dao")
public class MybatisgeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisgeneratorApplication.class, args);
    }

}
