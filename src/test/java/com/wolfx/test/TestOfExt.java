package com.wolfx.test;

import com.wolfx.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-14 9:07
 */
public class TestOfExt {

    //测试ApplicationListener&@EventListener功能
    @Test
    public void test02(){
        //IOC容器的创建
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        //IOC容器发布一个自定义的事件
        applicationContext.publishEvent(new ApplicationEvent(new String("我发布的事件")) {
        });
        //关闭容器
        applicationContext.close();
    }

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
    }

}
