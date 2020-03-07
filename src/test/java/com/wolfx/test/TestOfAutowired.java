package com.wolfx.test;

import com.wolfx.config.MainConfigOfAutowired;
import com.wolfx.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-07 14:09
 */
public class TestOfAutowired {

    //测试@Autowired
    @Test
    public void test01(){
        //创建容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        //从容器中获取BookService组件
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);
    }
}
