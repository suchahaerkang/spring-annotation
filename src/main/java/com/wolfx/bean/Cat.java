package com.wolfx.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-06 10:34
 */
@Component("cat")
public class Cat implements InitializingBean, DisposableBean {

    public Cat() {
        System.out.println("Cat的构造函数被执行");
    }
    //在组件创建和属性都赋值之后调用
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()方法执行...");
    }

    //在组件销毁之前调用
    public void destroy() throws Exception {
        System.out.println("destroy()方法执行...");
    }
}
