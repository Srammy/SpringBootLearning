package demo.srammy.mapperandrepository;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("demo.srammy.mapperandrepository.dao")
public class MapperandrepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperandrepositoryApplication.class, args);
    }

}
