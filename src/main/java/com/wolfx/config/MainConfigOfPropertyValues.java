package com.wolfx.config;

import com.wolfx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-07 11:00
 */
@PropertySource(value={"classpath:/person.properties"},encoding = "utf-8")
@Configuration
public class MainConfigOfPropertyValues {

    @Bean
    public Person person(){
        return new Person();
    }
}
