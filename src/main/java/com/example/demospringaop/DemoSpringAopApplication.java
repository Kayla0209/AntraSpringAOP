package com.example.demospringaop;

import com.example.demospringaop.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DemoSpringAopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoSpringAopApplication.class, args);
        System.out.println("Start!");

        User user = context.getBean(User.class);
        user.show();
    }


}
