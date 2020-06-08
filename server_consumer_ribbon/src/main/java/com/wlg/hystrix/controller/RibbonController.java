package com.wlg.hystrix.controller;

import com.wlg.hystrix.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName RibbonController
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/2
 * @Version V1.0
 **/
@RestController
@RequestMapping("ribbon")
public class RibbonController {

    private static final String url = "http://localhost:8081/provider/get";
    private static final String URL_PREFIX = "http://TEST-PROVIDER";

    @Autowired
    private RibbonService ribbonService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("get")
    public String get(){
//        RestTemplate template = new RestTemplate();
        String data = restTemplate.getForObject(URL_PREFIX+"/provider/get", String.class);
        return data;
    }

    @RequestMapping("/hello")
    public String hello(){
        return ribbonService.ribbonService("cc");
    }


    @RequestMapping("/getPerson")
    public Person getPerson(HttpServletRequest request){
            Person p = new Person();
            p.setMessage("请求成功");
            p.setUrl(request.getRequestURL().toString()+"----"+request.getRemoteAddr());
        return p;
    }

}
