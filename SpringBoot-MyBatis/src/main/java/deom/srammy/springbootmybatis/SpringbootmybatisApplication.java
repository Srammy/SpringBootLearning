package deom.srammy.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("deom.srammy.springbootmybatis.dao")
public class SpringbootmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisApplication.class, args);
    }

}
