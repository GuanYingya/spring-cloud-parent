package com.wlg.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName DataClient
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/2
 * @Version V1.0
 **/
@FeignClient(value = "Test-provider") 	//要调用的服务名称
@RequestMapping("provider")				//和调用服务controller的一致
@Repository
public interface DataClient {

    //和调用服务controller的一致
    @RequestMapping("get")
    public String getData();
}
