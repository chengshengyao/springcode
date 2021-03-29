package com.bjpowernode.ba04;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

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
     * 异常通知方法
     * public
     * 方法名自定义
     * 无参 可选Joinpoint或 Exception
     */
    /**
     * 异常通知注解
     * 属性 value = 切入点表达式
     * 属性 throwing 自定义变量 表示目标方法抛出的异常对象
     *特点：在目标方法抛出异常时执行
     * 特点：可以作异常的监控程序
     * 如有异常可发送邮件或短信进行通知
     */
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",throwing = "exception")
public  void  myAfterThrowing(Exception exception){
        System.out.println("【异常通知】异常发生时 ，执行"+exception.getMessage());
}
}

