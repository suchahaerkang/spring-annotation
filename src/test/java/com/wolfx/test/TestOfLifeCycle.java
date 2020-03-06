package com.wolfx.test;

import com.wolfx.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-06 9:07
 */
public class TestOfLifeCycle {

    //测试InitializingBean&DisposableBean&@PostConstruct&@PreDestroy自定义初始化和销毁方法
    @Test
    public void test2(){
        //创建容器
        System.out.println("IOC容器创建...");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("从容器中获取cat的实例...");
        applicationContext.getBean("cat");
        System.out.println("IOC容器关闭");
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }

    //测试@Bean自定义初始化和销毁方法
    @Test
    public void test1(){
        //创建容器
        System.out.println("IOC容器创建...");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("从容器中获取car的实例...");
        applicationContext.getBean("car");
        System.out.println("IOC容器关闭");
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
