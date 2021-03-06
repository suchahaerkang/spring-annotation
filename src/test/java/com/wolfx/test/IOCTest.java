package com.wolfx.test;

import com.wolfx.bean.Person;
import com.wolfx.bean.WhiteFactoryBean;
import com.wolfx.config.MainConfig;
import com.wolfx.config.MainConfig2;
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

    //测试FactoryBean
    @Test
    public void test06() throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println(applicationContext.getBean("&whiteFactoryBean"));
    }

    //测试@Import注解
    @Test
    public void test05(){
        //创建容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        //获取IOC容器中的所有组件名
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String name :beanNames) {
            System.out.println(name);
        }
    }

    //测试@Conditional注解
    @Test
    public void test04(){
        //创建容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        //通过组件类型从容器中获取所有的实例名字
        String[] beanNames = applicationContext.getBeanNamesForType(Person.class);
        for (String name :beanNames) {
            System.out.println(name);
        }
    }


    //测试@Scope和@Lazy注解
    @Test
    public void test03(){
        //创建IOC容器
        System.out.println("开始创建IOC容器...");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("第一次从容器中获取Person的实例...");
        Person person1 = (Person) applicationContext.getBean("person");
        System.out.println("第二次从容器中获取Person的实例...");
        Person person2 = (Person) applicationContext.getBean("person");

        System.out.println("两个实例对比结果：");
        System.out.println(person1 == person2);
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

    //测试通过xml方式的component-scan 自动扫描注册组件到容器中去
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name :names) {
            System.out.println(name);
        }
    }

}
