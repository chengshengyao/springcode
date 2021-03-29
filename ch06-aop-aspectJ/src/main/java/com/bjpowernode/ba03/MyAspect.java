package com.bjpowernode.ba03;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
     * 环绕通知
     * public修饰
     * 必须有返回值，推荐使用Object
     * 方法名称自定义
     * 方法有参数【固定】
     */
    /**
     * 属性 value = “ 切入点表达式”
     *方法定义上
     *功能最强的通知 在目标方法前后都可增强功能目标类的方法 /可控制目标方法的调用执行
     *             /可修改目标方法的返回值，影响最后的环绕结果
     *             参数 proceedingJoinPoint【开始连接点】 == 执行处理器中的method参数 的执行目标方法
     *             返回值：目标方法的执行结果
     * 环绕通知经常用于 事务的开启 执行目标方法后的提交
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //声明变量
        Object proceed=null;
        String name="";
        //实现环绕通知
        //获取第一个参数的值
        Object[] args = proceedingJoinPoint.getArgs();
        if (args!=null && args.length>1){
           name = (String)args[0];
        }
        //1.执行目标业务类的目标方法
        //2.进行目标功能的增强
        System.out.println("环绕通知在目标方法前输出时间："+new Date());
        if ("test".equals(name)){
           proceed  = proceedingJoinPoint.proceed();
        }
        System.out.println("环绕通知在目标方法后执行事务提交");
        //3.修改目标方法的执行结果，影响最后目标方法的调用结果
        if (proceed!=null){
            proceed="功能最强的通知【环绕通知】可修改目标方法的返回值，影响最后的环绕结果";
        }
        return proceed;
    }
}

