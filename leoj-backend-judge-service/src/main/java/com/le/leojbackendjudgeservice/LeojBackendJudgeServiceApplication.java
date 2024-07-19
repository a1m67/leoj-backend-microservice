package com.le.leojbackendjudgeservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.le")
@SpringBootApplication
public class LeojBackendJudgeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeojBackendJudgeServiceApplication.class, args);
    }

}
