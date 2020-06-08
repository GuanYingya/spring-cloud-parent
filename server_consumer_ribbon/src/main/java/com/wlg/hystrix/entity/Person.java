package com.wlg.hystrix.entity;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/3
 * @Version V1.0
 **/
public class Person {

    private String url;// 处理请求的服务器url
    private String message;// 提示信息

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
