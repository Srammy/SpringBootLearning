package demo.srammy.springboottomcat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.srammy.springboottomcat.dao")
public class SpringboottomcatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboottomcatApplication.class, args);
    }

}
