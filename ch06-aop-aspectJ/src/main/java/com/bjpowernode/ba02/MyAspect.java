package com.bjpowernode.ba02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

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
    //后置通知
    //定义方法，实现切面功能。
    //公共方法，有返回值， 方法名称自定义，参数推荐Object，参数名自定义
    //此注解[执行时机]的属性 value的值是【切入点表达式】，表示切面功能[执行位置]

    /**
     * 【后置通知】
     * 属性：1.value 切入点表达式
     * returning 自定义的变量 ，表示目标方法的返回时
     * <p>
     * 自定义变量名必须和通知方法的形参名一样
     * * @AfterReturning(value = "execution(* *..someseviceimpl.doOther(..))",returning = "obj")
     * 特点 执行时间：在目标方法后执行 可获取到目标方法的返回值数据，可根据返回值做各种处理
     * Object obj = doOther();
     */

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",returning = "res")
    public void myAfterReturning(Object res) {
        System.out.println("【后置通知】是在目标方法执行后执行，获取的返回值是"+res);
        if ("执行Other方法返回值哈哈哈哈哈哈哈哈哈哈哈哈".equals(res)){
            System.out.println("老子做你妈了个臭逼操作");
        }
        else System.out.println("能复制粘贴的部分尽量复制粘贴");
        //此处修改目标方法的返回值，是否影响最后的方法调用结果  结果并不影响
        if (res!=null){
            res="Hello Aspectj";
        }
    }
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther2(..))",returning = "res")
    public void myAfterReturning2(Object res) {
        System.out.println("【后置通知】是在目标方法执行后执行，获取的返回值是"+res);
        //此处修改目标方法的返回值，是否影响最后的方法调用结果  结果并不影响
        //若修改了res的值是否影响，最终执行结果
        if (res!=null){
            Student student = new Student();
            student.setName("带飞");
            student.setAge(44);
            res= student;


        }
    }
}
