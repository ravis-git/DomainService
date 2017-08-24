package com.my.experiments.microservices.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ravipalakodeti on 8/22/17.
 */
@SpringBootApplication
public class DomainServiceApplication { //extends ChassisMain {

    public static void main(String... args) {
        SpringApplication.run(DomainServiceApplication.class, args);
    }
}
