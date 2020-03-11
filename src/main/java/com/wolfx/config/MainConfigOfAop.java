package com.wolfx.config;


import com.wolfx.aop.LogAspects;
import com.wolfx.aop.MathCalculate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-09 8:50
 */
@EnableAspectJAutoProxy
@Configuration
public class MainConfigOfAop {

    @Bean
    public MathCalculate mathCalculate(){
        return new MathCalculate();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
