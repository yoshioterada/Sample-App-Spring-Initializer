package com.yoshio3.sample-app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CosmosDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(CosmosDbApplication.class, args);
    }
}
