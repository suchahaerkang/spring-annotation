package com.wolfx.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @description: 日志切面
 * @author: sukang
 * @date: 2020-03-09 8:53
 */
//这个注解必须要写，不然不知道这个组件是个切面组件
@Aspect
public class LogAspects {

    //切入点，标志切入的目标方法为MathCalculate组件里面的所有方法
    @Pointcut("execution(public int com.wolfx.aop.MathCalculate.*(..))")
    public void pointCut(){
    }

    //前置通知：在指定方法执行之前进行执行这个方法，JoinPoint组件可以获取当前目标函数的一些信息
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        //获取参数列表
        Object[] objects = joinPoint.getArgs();
        System.out.println("方法"+ joinPoint.getSignature().getName() + "执行前执行切面的前置通知@Before打印请求参数为："+ Arrays.toString(objects));
    }

    //后置通知：在指定方法执行之后执行这个方法
    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println("方法"+ joinPoint.getSignature().getName() + "执行后执行切面的后置通知");
    }

    /*
     * 返回通知：是在目标方法返回的时候进行执行，logReturn()方法的表示结果的参数值result
     * 要和注解@AfterReturning中returning的值一样，不然接受不了。另外JoinPoint这个组件作为
     * logReturn方法的参数必须要放在第一个参数，否则会报错
     */
    @AfterReturning(pointcut = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result){
        System.out.println("方法"+ joinPoint.getSignature().getName() + "返回的时候执行切面的返回通知返回的结果为：" + result);
    }

    /*
     * 异常通知：是在目标方法抛出异常的时候进行执行，logException()方法的表示异常的参数值exception
     * 要和注解@AfterThrowing中exception的值一样，不然接受不了。另外JoinPoint这个组件作为
     * logException方法的参数必须要放在第一个参数，否则会报错
     */
    @AfterThrowing(pointcut = "pointCut()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception){
        System.out.println("方法"+ joinPoint.getSignature().getName() + "抛出异常的时候执行切面的异常通知抛出异常信息为：" + exception);
    }

}
