package com.facultate.aos.appdocker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppdockerApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(AppdockerApplication.class,args);

    }

    @Override
    public void run(String... args) {
        System.out.println(" Server si up and running");
    }
}
