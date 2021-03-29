package com.bjpowernode;

import com.bjpowernode.ba06.SomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyTest06 {
    @Resource
    private SomeService someService;

    @Test
    public void testAspect() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        SomeService someService = (SomeService) applicationContext.getBean("someService");
        someService.doThird();

    }
}


