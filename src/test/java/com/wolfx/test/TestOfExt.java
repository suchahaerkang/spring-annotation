package com.wolfx.test;

import com.wolfx.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-14 9:07
 */
public class TestOfExt {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
    }
}
