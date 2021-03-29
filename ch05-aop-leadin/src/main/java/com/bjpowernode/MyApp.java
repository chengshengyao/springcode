package com.bjpowernode;

import com.bjpowernode.handler.ThisHandler;
import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/12 10:46
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class MyApp {
    public static void main(String[] args) {
        //进行方法调用
//        SomeService someService =  new SomeServiceImpl();
//        someService.doSome();
//        System.out.println("------------------");
//        someService.doOther();
        /**
         * 使用JDK的Proxy创建代理对象：
         * 1传入目标对象给处理器的实现类
         * 2创建代理类对象【反射的Proxy类】
         * 3创建代理对象调用newProxyInstance（参数目标类反射的类加载器，接口，h）
         * 4转目标接口类型
         */
        //
        SomeService target = new  SomeServiceImpl();
        InvocationHandler h = new ThisHandler(target);
        //1
        SomeService proxy_obj = (SomeService)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), h);
        //proxy_obj.doSome();
        proxy_obj.doOther();
    }
}
