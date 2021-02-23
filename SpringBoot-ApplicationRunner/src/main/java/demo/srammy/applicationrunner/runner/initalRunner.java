package demo.srammy.applicationrunner.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
//public class initalRunner implements ApplicationRunner {
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        System.out.println(args);
//        System.out.println("容器启动时执行");
//    }
//
//}

@Component
public class initalRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(args);
        System.out.println("容器启动时执行");
    }
}