package com.bjpowernode;

import com.bjpowernode.ba02.School;
import com.bjpowernode.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/10 18:29
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class MyTest02 {
    @Test
    public void test_newSchool(){
        School school = new School();
        school.setName("拉胯动力节点");
        school.setAdd("上海还不错");
        Student student = new Student();
        student.setName("大飞");
        student.setAge(44);
        student.setSchool(school);
        System.out.println("[new的方式]学生类型引用学校类型："+student);
    }
    @Test
    public void testXmlNew_Di(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ba02/applicationContext.xml");
        Student student = (Student)applicationContext.getBean("thisIsStudent");
        System.out.println("类中引用类型属性通过set注入【设置属性值】"+student);
    }
}
