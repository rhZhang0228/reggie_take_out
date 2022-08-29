package com.itheima;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@EnableCaching
public class ReggieTakeOutApplication {

    public static void main(String[] args) {
        //http://localhost:8080/front/page/in.html
        //http://localhost:8080/backend/page/login/login.html
        //http://localhost:8080/doc.html#/home
        SpringApplication.run(ReggieTakeOutApplication.class, args);
    }

}


