package com.wolfx.aop;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-09 8:52
 */
public class MathCalculate {

    /**
     * @description: 计算除法的方法
     * @param a
     * @param b
     * @return: int
     * @author: sukang
     * @date: 2020/3/9 8:52
     */
    public int div(int a, int b){
        System.out.println("div()方法执行...");
        return a/b;
    }
}
