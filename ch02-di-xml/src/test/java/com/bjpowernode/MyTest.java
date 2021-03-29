package com.bjpowernode;


import com.bjpowernode.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/9 19:11
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class MyTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("ba01/applicationContext.xml");
        Student student =(Student)applicationContext.getBean("thisIsStudent");
        //student.setName("此处进行学生对象属性的赋值");
        //student.setAge(1);
       System.out.println("【依赖注入技术实现方式之一】基于配置文件设置对象属性通过自定义对象的set（）方法:"
               +student);
        Date date = (Date) applicationContext.getBean("date");
        System.out.println(date);
    }
}
