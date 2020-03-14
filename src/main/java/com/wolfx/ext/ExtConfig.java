package com.wolfx.ext;

import com.wolfx.bean.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-14 9:01
 */
@ComponentScan("com.wolfx.ext")
@Configuration
public class ExtConfig {

    @Bean
    public Blue blue(){
        return new Blue();
    }
}
