package com.bjpowernode;

import com.bjpowernode.ba01.SomeService;
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

public class MyTest01 {
    @Test
    public void testAspect(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService someService = (SomeService) applicationContext.getBean("someService");
        System.out.println(someService.getClass().getName());
        someService.doSome("测试AOP",1);
    }
}
