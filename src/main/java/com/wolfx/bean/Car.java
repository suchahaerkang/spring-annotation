package com.wolfx.bean;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-06 9:01
 */
public class Car {
    public Car() {
        System.out.println("bean创建...");
    }

    public void init(){
        System.out.println("bean初始化方法...");
    }

    public void destroy(){
        System.out.println("bean销毁方法...");
    }
}
