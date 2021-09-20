package com.auguitu.hello.service;

import com.auguitu.hello.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 默认不注入容器
 */
public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String name){
        return helloProperties.getPrefix() + ":"+name+"=>"+helloProperties.getSubfix();
    }
}
