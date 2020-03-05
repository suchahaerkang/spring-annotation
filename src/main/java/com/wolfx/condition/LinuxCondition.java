package com.wolfx.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-05 12:38
 */
public class LinuxCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //可以获取运行时的环境变量和jvm变量
        Environment environment = conditionContext.getEnvironment();
        //这里我们就通过Environment对象获取操作系统的名字
        String osName = environment.getProperty("os.name");
        System.out.println("本操作系统为：" + osName);
        //如果操作系统为windows那么返回成功
        if(osName.contains("Linux")){
            return true;
        }

        return false;
    }
}
