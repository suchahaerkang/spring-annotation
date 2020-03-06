package com.wolfx.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-06 11:02
 */
@Component("dog")
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Dog() {
        System.out.println("Dog的构造函数被执行...");
    }

    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct标注的方法被执行...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("@PreDestroy标注的方法被执行...");
    }

    //将ApplicationContext容器注入到这个组件中去
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
