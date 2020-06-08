package com.wlg.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName Application_Zuul
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/2
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Application_Zuul {
    public static void main(String[] args){
        SpringApplication.run(Application_Zuul.class);
    }
}

