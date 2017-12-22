package org.my.cloud.cunsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by Administrator on 2017/12/20.
 * Feign是一个声明式Web Service客户端。
 * 使用Feign能让编写Web Service客户端更加简单,它的使用方法是定义一个接口，然后在上面添加注解，同时也支持JAX-RS标准的注解。
 * Feign也支持可拔插式的编码器和解码器。
 * Spring Cloud对Feign进行了封装，使其支持了Spring MVC标准注解和HttpMessageConverters。
 * Feign可以与Eureka和Ribbon组合使用以支持负载均衡。
 */


@SpringBootApplication
@EnableDiscoveryClient /*启用服务注册与发现*/
@EnableFeignClients /*启用feign进行远程调用*/
@EnableHystrixDashboard
@EnableCircuitBreaker
public class ConsumerHystrixDashboard2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashboard2Application.class, args);
    }

}