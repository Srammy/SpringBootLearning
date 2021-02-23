package demo.srammy.springbootpagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.srammy.springbootpagehelper.dao")
public class SpringbootpagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootpagehelperApplication.class, args);
    }

}
