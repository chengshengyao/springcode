package com.bjpowernode;

import com.bjpowernode.ba03.SomeService;
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
public class MyTest03 {
    @Test
    public void testAspect() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService someService = (SomeService) applicationContext.getBean("someService");
        String s = someService.doOther("测试后置通知", 2);

    }
    @Test
    public void testWork() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService someService = (SomeService) applicationContext.getBean("someService");
        String doFirst = someService.doFirst("test", 20);
        System.out.println(doFirst);

    }
}


