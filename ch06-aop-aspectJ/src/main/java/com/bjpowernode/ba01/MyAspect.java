package com.bjpowernode.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;
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
    //定义方法，实现切面功能。
    //公共方法，无返回值， 名称自定义，参数可有可无，若非自定义，有可选参数类型
    //此注解[执行时机]的属性 value的值是【切入点表达式】，表示切面功能[执行位置]

//    @Before(value = "execution(public void com.bjpowernode.ba01.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore() {
//        //此方法是切面要执行的功能代码
//        System.out.println("【前置通知】目标方法执行之前，打印当前时间" + new Date());
//    }

//    @Before(value = "execution( void com.bjpowernode.ba01.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore() {
//        //此方法是切面要执行的功能代码
//        System.out.println("【前置通知】目标方法执行之前，打印当前时间" + new Date());
//    }

//    @Before(value = "execution( void *..SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore() {
//        //此方法是切面要执行的功能代码
//        System.out.println("【前置通知】目标方法执行之前，打印当前时间" + new Date());
//    }

//    @Before(value = "execution( void *..SomeServiceImpl.doSome(..))")
//    public void myBefore() {
//        //此方法是切面要执行的功能代码
//        System.out.println("【前置通知】目标方法执行之前，打印当前时间" + new Date());
//    }

//    @Before(value = "execution( void *..SomeServiceImpl.do*(..))")
//    public void myBefore() {
//        //此方法是切面要执行的功能代码
//        System.out.println("【前置通知】目标方法执行之前，打印当前时间" + new Date());
//    }

//    @Before(value = "execution( void do*(..))")
//    public void myBefore() {
//        //此方法是切面要执行的功能代码
//        System.out.println("【前置通知】目标方法执行之前，打印当前时间" + new Date());
//    }

    /**
     * 指定通知方法中的参数：JoinPoint
     * joinPoint【连接点】：要加入切面方法进行增强的 业务方法
     * 作用：在 通知【advice】 中获取业务方法的连接点信息 包括：业务方法的名称及其实际参数
     * JoinPoint的参数是框架赋予的；放在 【通知】的构造器中的第一个参数位置
     * 根据需求选择 添加 连接点JoinPoint
     */
    @Before(value = "execution( void *..SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(JoinPoint joinPoint) {
        //连接点获取业务方法中的各种信息
        System.out.println("获取业务方法的签名【签名就是方法的定义】"+joinPoint.getSignature());
        System.out.println("获取业务方法的名称"+joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        Arrays.asList(args).forEach(s-> System.out.print("获取业务方法的实参:"+s+"\t"));
        //此方法是切面要执行的功能代码
        System.out.println("【前置通知】目标方法执行之前，打印当前时间" + new Date());
    }

}
