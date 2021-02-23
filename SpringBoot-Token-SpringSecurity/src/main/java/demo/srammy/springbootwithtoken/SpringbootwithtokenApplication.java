package demo.srammy.springbootwithtoken;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.srammy.springbootwithtoken.dao")
public class SpringbootwithtokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwithtokenApplication.class, args);
    }

}
