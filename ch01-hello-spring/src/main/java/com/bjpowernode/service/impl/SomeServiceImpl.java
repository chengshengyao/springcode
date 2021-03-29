package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/9 19:10
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class SomeServiceImpl implements SomeService {
//    static {
//        System.out.println("SomeServiceImpl咖啡豆被SPRING容器通过" +
//                "依赖注入【DI】的反射实现创建，体现出ioC控制反转的概念");
//    }

    public SomeServiceImpl() {
        System.out.println("【无参构造】SomeServiceImpl咖啡豆被SPRING容器通过" +
               "依赖注入【DI】的反射实现创建，体现出ioC控制反转的概念");
    }

    @Override
    public void doSome() {
        System.out.println("此处执行SomeServiceImpl的doSome（）方法");

    }
}
