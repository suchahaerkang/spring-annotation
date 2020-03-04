package com.wolfx.test;

import com.wolfx.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-04 14:59
 */
public class IOCTest {

    //测试通过xml方式的component-scan 自动扫描注册组件到容器中去
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name :names) {
            System.out.println(name);
        }
    }

    //测试通过@ComponentScan注解进行自动扫描组件到容器中去
    @Test
    public void test02(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name :names) {
            System.out.println(name);
        }
    }
}
