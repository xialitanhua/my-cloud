package org.my.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2017/12/19.
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaService3Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService3Application.class, args);
    }
}
