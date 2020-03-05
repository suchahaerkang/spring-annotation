package com.wolfx.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-05 16:26
 */
public class WhiteFactoryBean implements FactoryBean<White> {

    //FactoryBean 是通过这个方法将组件添加到容器中的
    public White getObject() throws Exception {
        return new White();
    }

    public Class<?> getObjectType() {
        return White.class;
    }

    //true:为单实例
    //false:为多实例
    public boolean isSingleton(){
        return true;
    }
}
