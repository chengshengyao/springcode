package com.bjpowernode.ba01;

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
}
