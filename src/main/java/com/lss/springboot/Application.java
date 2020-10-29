package com.lss.springboot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer    //启用Spring Boot Admin 组件功能，进行应用的监控，显示监控信息
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
