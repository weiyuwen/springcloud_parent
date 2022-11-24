package com.chixing;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients// 1. 当前服务 注册到Nacos中心  2. 实现负载均衡
@MapperScan("com.chixing.mapper")
public class CustomerMain7001{
    public static void main( String[] args )  {
        SpringApplication.run(CustomerMain7001.class,args);
    }


}
