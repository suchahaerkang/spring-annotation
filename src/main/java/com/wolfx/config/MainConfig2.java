package com.wolfx.config;

import com.wolfx.bean.Person;
import com.wolfx.condition.LinuxCondition;
import com.wolfx.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-05 10:27
 */
@Configuration
public class MainConfig2 {

    @Lazy
    @Scope
    @Bean("person")
    public Person person(){
        System.out.println("开始创建Person实例....");
        return new Person("张三", 18);
    }

    @Conditional(WindowsCondition.class)
    @Bean("bill")
    public Person person01(){
        return new Person("bill", 65);
    }

    @Conditional(LinuxCondition.class)
    @Bean("linus")
    public Person person02(){
        return new Person("linus", 67);
    }
}
