package com.bjpowernode;

import com.bjpowernode.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/12 18:07
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class MyTest07 {
    @Test
    public void testAspect() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeServiceImpl someService = (SomeServiceImpl) applicationContext.getBean("someService");
        //someService:com.bjpowernode.ba07.SomeServiceImpl$$EnhancerBySpringCGLIB$$ac5ee2e2
        //目标类没有接口时，spring框架自动应用使用CGLIB动态代理
        System.out.println("someService:"+someService.getClass().getName());
        someService.doThird();

    }
}


