package com.digianalytix.mobile_de;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties
@EnableJpaRepositories
@EnableJpaAuditing
@EnableScheduling
@EnableAsync
public class MobileDeDataSyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileDeDataSyncApplication.class, args);
    }

}
