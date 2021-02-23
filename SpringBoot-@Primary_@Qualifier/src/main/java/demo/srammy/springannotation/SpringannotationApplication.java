package demo.srammy.springannotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.srammy.springannotation.dao")
public class SpringannotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringannotationApplication.class, args);
    }

}
