package com.wolfx.config;

import com.wolfx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-04 12:42
 */
@Configuration
public class MainConfig {

    //@Bean 注册组件，类型为方法返回值，id默认为方法名，如果@Bean组件添加value值，那么id就以value值为主
    @Bean
    public Person person(){
        return new Person("张三", 18);
    }
}
