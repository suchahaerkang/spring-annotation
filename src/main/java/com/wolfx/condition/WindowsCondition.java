package com.wolfx.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-05 12:27
 */
public class WindowsCondition implements Condition {

    /**
     * @description:
     * @param conditionContext 判断条件需要的上下文
     * @param annotatedTypeMetadata 获取的注解信息
     * @return: boolean
     * @author: sukang
     * @date: 2020/3/5 12:28
     */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //可以获取ioc容器创建实例的bean工厂
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //可以获取类加载器
        ClassLoader classLoader = conditionContext.getClassLoader();
        //可以获取运行时的环境变量和jvm变量
        Environment environment = conditionContext.getEnvironment();
        //可以获取注册都容器中的所有实例
        BeanDefinitionRegistry beanDefinitionRegistry = conditionContext.getRegistry();
        //这里我们就通过Environment对象获取操作系统的名字
        String osName = environment.getProperty("os.name");
        System.out.println("本操作系统为：" + osName);
        //如果操作系统为windows那么返回成功
        if(osName.contains("Windows")){
            return true;
        }

        return false;
    }
}
