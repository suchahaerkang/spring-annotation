package com.wolfx.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-05 15:18
 */
public class Red implements ApplicationContextAware, EmbeddedValueResolverAware, BeanNameAware {

    public Red() {
        System.out.println("Red 组件创建.....");
    }

    //实现ApplicationContextAware接口回调的方法，会在创建Red组件之后调用这个方法
    // 将ApplicationContext组件传给Red组件
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("容器组件："+ applicationContext);
    }

    /**
     * 实现EmbeddedValueResolverAware接口回调的方法，会在创建Red组件之后调用这个方法
     * 将StringValueResolver组件传给Red组件
     * StringValueResolver这类的作用：
     * 可以解析SPEL表达式，也可以解析${}从运行环境中获取值
     */
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String str = resolver.resolveStringValue("我是 ${os.name}，今年 #{20-2} 岁");
        System.out.println(str);
    }

    //实现BeanNameAware接口回调的方法，会在创建Red组件之后调用这个方法
    //将Red组件在容器中的名字传过来
    public void setBeanName(String name) {
        System.out.println("Red组件在容器中的名字为：" + name);
    }
}
