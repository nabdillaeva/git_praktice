package com.example.git_praktice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPrakticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitPrakticeApplication.class, args);

        for (int i = 0; i < 20; i++) {
            System.out.println("Ulan");

            System.out.println("gadgetarium rulit");
        }

        System.out.println("gadgetarium rulit");
    }


}
