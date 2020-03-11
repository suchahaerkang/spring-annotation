package com.wolfx.test;

import com.wolfx.aop.MathCalculate;
import com.wolfx.config.MainConfigOfAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-09 9:29
 */
public class TestOfAop {

    //测试AOP功能
    @Test
    public void test01(){
        //创建容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAop.class);
        //从容器中获取MathCalculate的对象
        MathCalculate mathCalculate = (MathCalculate) applicationContext.getBean("mathCalculate");
        //调用mathCalculate的div方法
        mathCalculate.div(4,0);
    }
}
