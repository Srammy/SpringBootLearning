package demo.srammy.springbootwithswagger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("demo.srammy.springbootwithswagger.dao")
public class SpringbootwithswaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwithswaggerApplication.class, args);
    }

}
