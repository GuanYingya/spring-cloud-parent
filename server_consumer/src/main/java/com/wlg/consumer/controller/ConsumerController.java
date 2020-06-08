package com.wlg.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsumerController
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/2
 * @Version V1.0
 **/
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    //资源路径
    private final String url = "http://localhost:8081/provider/get";

    @RequestMapping("get")
    public String get(){
        RestTemplate template = new RestTemplate();
        String data = template.getForObject(url, String.class);
        return data;
    }
}

