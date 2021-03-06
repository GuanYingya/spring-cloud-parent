package com.wlg.feign.controller;

import com.wlg.feign.client.DataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DataFeignController
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/2
 * @Version V1.0
 **/
@RestController
@RequestMapping("consumer")
public class DataFeignController {

    @Autowired
    private DataClient dataClient;

    @RequestMapping("feignGet")
    public String get(){
        return dataClient.getData();
    }

}
