package com.train.springboot.config;

import com.train.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.jvm.hotspot.HelloWorld;

/**
 * @author yidong
 * @create 2019-01-09-16:05
 */

@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
