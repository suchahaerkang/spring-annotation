package com.wolfx.test;

import com.wolfx.config.MainConfigOfTx;
import com.wolfx.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-13 9:22
 */
public class TestOfTx {

    @Test
    public void test01(){
        //创建IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfTx.class);
        //获取UserService组件
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.insert();
    }
}
