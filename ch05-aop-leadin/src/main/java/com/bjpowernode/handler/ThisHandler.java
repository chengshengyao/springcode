package com.bjpowernode.handler;

import com.bjpowernode.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.handler
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/12 11:18
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class ThisHandler implements InvocationHandler {
    //声明目标对象[someserviceimpl]
    private Object target;
    //生成构造方法传入目标对象

    public ThisHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理对象执行方式时，调用invoke方法
        System.out.println("会执行invocationHandler的invoke");
        //System.out.println("此时执行了"+method.getName()+"方法");
        Object result = null;
        //切面的执行位置【JoinPoint连接点】/pointCut【切入点：是连接点的集合】
        if (method.getName().equals("doSome")) {
            //切面执行的时间【Advice】
            ServiceTools.doLog();
            //执行目标类的方法[someserviceimpl类的dosome（）/doother（）]
            //参数表示 目标类，args 返回目标方法的返回结果是一个Object类型
            result = method.invoke(target, args);
            ServiceTools.doTrans();
        } else result = method.invoke(target, args);
        //目标方法的执行结果
        return result;
    }
}
