package com.wlg.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName Application_Config
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/8
 * @Version V1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class Application_Config {


    public static void main(String[] args){

        SpringApplication.run(Application_Config.class,args);
    }

}
