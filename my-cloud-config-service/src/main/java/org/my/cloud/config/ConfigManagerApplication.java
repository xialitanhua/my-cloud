package org.my.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2017/12/19.
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigManagerApplication.class, args);
    }
}
