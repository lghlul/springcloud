package com.lu;

import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @CLassName FifterConfiguration
 * @Description TODO
 * @Author ll
 * @Date 2018/10/26 16:18
 **/
@ConfigurationProperties("zuul.filter")
public class FilterConfiguration {

    private String root;
    private Integer interval;


    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}


