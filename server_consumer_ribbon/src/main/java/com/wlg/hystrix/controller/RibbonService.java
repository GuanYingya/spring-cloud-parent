package com.wlg.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RibbonService
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/2
 * @Version V1.0
 **/
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String ribbonService(String name){
        return restTemplate.getForObject("http://TEST-PROVIDER/hystrix/hello?name="+name,String.class);
    }

}
