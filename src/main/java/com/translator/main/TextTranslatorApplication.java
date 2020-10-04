package com.translator.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TextTranslatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TextTranslatorApplication.class, args);
    }

}
