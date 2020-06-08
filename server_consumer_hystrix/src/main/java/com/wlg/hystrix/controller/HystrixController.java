package com.wlg.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

/**
 * @ClassName DemoController
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/3
 * @Version V1.0
 **/
@RestController
@RequestMapping("hystrix")
public class HystrixController extends Thread{

    private final String url = "http://localhost:8081/provider/get";

    @RequestMapping("/test")
    @HystrixCommand(fallbackMethod = "processHystrix_get")
    public String test(){
        RestTemplate template = new RestTemplate();
        String data = template.getForObject(url, String.class);
        // 为了演示超时现象，我们在这里然线程休眠,时间随机 0~2000毫秒
        try {
            Thread.sleep(new Random().nextInt(10*2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return data;
    }


    public String processHystrix_get(){
        return "provider is error";
    }

}
