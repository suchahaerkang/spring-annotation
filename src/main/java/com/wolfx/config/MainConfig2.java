package com.wolfx.config;

import com.wolfx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-05 10:27
 */
@Configuration
public class MainConfig2 {

    @Lazy
    @Scope
    @Bean("person")
    public Person person(){
        System.out.println("开始创建Person实例....");
        return new Person("张三", 18);
    }
}
