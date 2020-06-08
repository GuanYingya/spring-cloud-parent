package com.wlg.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName Application_Providers
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/2
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class Application_Providers {

    public static void main(String[] args){
        SpringApplication.run(Application_Providers.class);
    }

    @Bean    //注入一个bean到ioc容器中
    @LoadBalanced //开启负载均衡功能
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}

