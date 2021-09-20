package com.auguitu.hello.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("atguigu.hello")
public class HelloProperties {
    private String prefix;
    private String subfix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSubfix() {
        return subfix;
    }

    public void setSubfix(String subfix) {
        this.subfix = subfix;
    }
}
