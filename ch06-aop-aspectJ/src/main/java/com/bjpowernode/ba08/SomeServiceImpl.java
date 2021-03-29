package com.bjpowernode.ba08;


/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.ba01
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/12 17:27
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
// 目标类
public class SomeServiceImpl implements SomeService {
   //业务方法
    @Override
    public void doSome(String name,Integer age) {
        //给doSome()方法进行增强 在执行前 打印时间
        System.out.println("目标方法的doSome执行");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("目标方法的doOther执行");
        return "执行Other方法返回值哈哈哈哈哈哈哈哈哈哈哈哈";
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("----业务方法doFirst()----");

        return "DO_FIRST!";
    }

    @Override
    public void doSecond() {
        System.out.println("执行业务方法doSecond时"+(6/0));
    }

    @Override
    public void doThird() {
        System.out.println("执行业务方法的dOThird()方法");
    }


}
