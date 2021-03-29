package com.bjpowernode;

import com.bjpowernode.ba04.School;
import com.bjpowernode.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/11 20:48
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class MyTest04 {
    @Test
    public void testComponent(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("createStudent4");
        //School createSchool = (School) applicationContext.getBean("createSchoo2");
        System.out.println("【依赖注入】通过注解的方式创建对象"+student);
    }
}
