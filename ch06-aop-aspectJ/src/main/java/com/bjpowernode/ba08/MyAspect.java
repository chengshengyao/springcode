package com.bjpowernode.ba08;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.ba01
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/12 17:32
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
//切面类也就是一个普通类，使用注解声明此类为
//切面类：是用来给业务目标类中的方法进行增强。
//此注解是ASPECTJ框架中的注解
@Aspect
public class MyAspect {
    /**
     * 最终通知方法
     * public
     * 方法名自定义
     * 无参 可选Joinpoint
     */
    /**
     * 若项目有可复用的切入点表达式
     * 使用@pointCut声明一个方法
     * 此方法名就是切入点表达式的别名
     * value=“【方法名就是切入点表达式的别名】”
     */
    @Before(value = "kobe()")
    public void MyBefore() {
        System.out.println("【前置通知】");
    }
    @After(value = "kobe()")
    public void myAfter() {
        System.out.println("【最终通知】：总是会被执行的方法代码，被使用于资源的的关闭或者清理");
    }
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void kobe(){
     //无需代码
    }

}

