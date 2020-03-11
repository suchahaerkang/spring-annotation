package com.wolfx.test;

import com.wolfx.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-08 12:55
 */
public class TestOfProfile {

    @Test
    public void test02(){
        //创建容器调用无参构造函数
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //激活测试环境
        applicationContext.getEnvironment().setActiveProfiles("test");
        //注册MainConfigOfProfile组件
        applicationContext.register(MainConfigOfProfile.class);
        //刷新容器
        applicationContext.refresh();

        //获取容器中组件为DataSource的所有名字
        String[] beanNames = applicationContext.getBeanNamesForType(DataSource.class);

        for (String name : beanNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test01(){
        //创建容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);
        //获取容器中组件为DataSource的所有名字
        String[] beanNames = applicationContext.getBeanNamesForType(DataSource.class);

        for (String name : beanNames) {
            System.out.println(name);
        }
    }
}
