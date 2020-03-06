package com.wolfx.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-06 12:27
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    //组件创建并属性赋值之后，初始化函数执行之前执行这个方法
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization方法执行...");
        return bean;
    }

    //组件创建并属性赋值之后，初始化函数执行之后执行这个方法
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization方法执行...");
        return bean;
    }

}
