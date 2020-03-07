package com.wolfx.test;

import com.wolfx.bean.Person;
import com.wolfx.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-07 11:02
 */
public class TestOfPropertyValues {

    @Test
    public void test02(){
        //创建容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
        //从容器中获取环境变量组件
        Environment environment = applicationContext.getEnvironment();
        //从环境变量中获取person.nickName值
        String nickName = environment.getProperty("person.nickName");
        System.out.println("从环境变量中获取的nickName为：" + nickName);
    }

    //测试@Value和@PropertySource
    @Test
    public void test01(){
        //创建容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
        //从容器中获取id为person的Person组件
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
