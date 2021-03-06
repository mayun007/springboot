package com.yq.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * Simple to Introduction
 * className: ConsulConfig
 *  从配置文件中获取配置使用@value，当你在bean加载时调用@value时会出现空指针异常。因为bean加载完成后才会执行@value。
 * @author EricYang
 * @version 2018/9/1 10:04
 */
@Configuration
@Data
@Order(1)
public class ConsulConfig {
    //the default ip is 127.0.0.1
    @Value("${consul.ip:127.0.0.1}")
    private String consulIP;

    // the default port is 8500
    @Value("${consul.port:8500}")
    private int consulPort;

    public ConsulConfig() {
        System.out.println("ConsulConfig启动初始化。。。");
    }
}