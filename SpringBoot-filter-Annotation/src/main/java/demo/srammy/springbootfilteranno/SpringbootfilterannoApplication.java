package demo.srammy.springbootfilteranno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringbootfilterannoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootfilterannoApplication.class, args);
    }

}
