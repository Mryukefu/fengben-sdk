package com.fengben.fengbenadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FengbenAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(FengbenAdminApplication.class, args);
    }

}
