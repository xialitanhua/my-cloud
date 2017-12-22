package org.my.cloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by Administrator on 2017/12/20.
 */

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class DashboardTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(DashboardTurbineApplication.class, args);
    }
}
