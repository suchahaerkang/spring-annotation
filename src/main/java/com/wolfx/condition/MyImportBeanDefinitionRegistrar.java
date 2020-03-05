package com.wolfx.condition;

import com.wolfx.bean.RainBow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-05 16:00
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * @description:
     * @param importingClassMetadata  当前注解@Import标注的类的所有注解信息
     * @param registry 组件信息注册中心，通过它可以手动注册组件
     * @return: void
     * @author: sukang
     * @date: 2020/3/5 16:04
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //判断容器中是否有Blue和Yellow的组件
        Boolean boolean1 = registry.containsBeanDefinition("com.wolfx.bean.Blue");
        Boolean boolean2 = registry.containsBeanDefinition("com.wolfx.bean.Yellow");

        if(boolean1 && boolean2){
            //定义一个RainBow组件信息，这里也可以指定一个组件的作用域
            BeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            //将RainBow组件信息注册到容器中去，在容器中的id为rainBow
            registry.registerBeanDefinition("rainBow", beanDefinition);
        }

    }
}
