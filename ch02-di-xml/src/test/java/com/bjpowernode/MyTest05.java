package com.bjpowernode;

import com.bjpowernode.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/11 8:52
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class MyTest05 {
    @Test
    public void testConstructor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ba05/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("thisIsStudent");
        System.out.println("使用构造注入实现对象属性的赋值" +
                "依赖注入技术" +
                "控制反转思想" + student);
    }
}

