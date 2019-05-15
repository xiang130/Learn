package com.wujp.eurekaclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication

@RestController
public class EurekaClient2Application {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String name;

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient2Application.class, args);
    }


    @RequestMapping("/")
    public String home() {
        return "hello world from  "+ name + ":" + port;
    }


}
