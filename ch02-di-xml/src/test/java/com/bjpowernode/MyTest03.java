package com.bjpowernode;

import com.bjpowernode.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
public class MyTest03 {
    @Test
    public void testConstructor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ba03/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("thisIsStudent");
        Student student2 = (Student) applicationContext.getBean("thisIsStudent2");
        System.out.println("使用构造注入实现对象属性的赋值" +
                "依赖注入技术" +
                "控制反转思想" + student);
        System.out.println("使用constructor arg标签中的index 属性进行属性赋值给学生对象2" + student2);

    }

    @Test
    public void testFile() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ba03/applicationContext.xml");
        File myfile = (File) applicationContext.getBean("myfile");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(myfile);
            byte[] bytes = new byte[1024 * 1024];
            int length = 0;
            while ((length = fileInputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, length));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
