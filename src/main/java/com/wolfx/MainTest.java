package com.wolfx;

import com.wolfx.bean.Person;
import com.wolfx.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-04 12:16
 */
public class MainTest {
    public static void main(String[] args) {
        //通过ClassPathXmlApplicationContext的方式获取从spring中获取组件
      /*  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);*/

        //通过AnnotationConfigApplicationContext的方式从spring中获取组件
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
