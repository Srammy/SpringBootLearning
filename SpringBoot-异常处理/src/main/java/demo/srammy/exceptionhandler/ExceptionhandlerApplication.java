package demo.srammy.exceptionhandler;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.srammy.exceptionhandler.dao")
public class ExceptionhandlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionhandlerApplication.class, args);
    }

}
