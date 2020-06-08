package com.wlg.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ProviderController
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/2
 * @Version V1.0
 **/
@RestController
@RequestMapping("provider")
public class ProviderController {

    @RequestMapping("get")
    public String getData(){
        return "我是服务提供者2号，提供了数据";
    }

}
