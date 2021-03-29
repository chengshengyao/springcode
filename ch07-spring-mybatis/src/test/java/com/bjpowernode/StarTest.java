package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/13 20:05
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */

/**
 * 容器中对象名称：sqlSessionFactory---org.apache.ibatis.session.defaults.DefaultSqlSessionFactory@13cf7d52
 * 容器中对象名称：org.mybatis.spring.mapper.MapperScannerConfigurer#0---org.mybatis.spring.mapper.MapperScannerConfigurer@3a3e4aff
 * 容器中对象名称：orderDao---org.apache.ibatis.binding.MapperProxy@7e22550a
 * 容器中对象名称：studentDao---org.apache.ibatis.binding.MapperProxy@62452cc9
 */
public class StarTest {
    @Test
    public void test01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(s -> System.out.println("容器中对象名称：" + s + "---" +
                applicationContext.getBean(s)));
    }

    @Test
    public void testStudentDaoInsertStudent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取spring容器中的DAO对象
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
        Student student = new Student();
        student.setId(1);
        student.setName("马克扎克伯格");
        student.setAge(40);
        student.setEmail("FACEBOOK@MOVIE.COM");
        int result = studentDao.insertStudent(student);
        System.out.println("影响"+result+"条记录行数");
    }

    @Test
    public void testStudentServiceAddStudent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取spring容器中的SERVICE对象
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
        Student student = new Student();
        student.setId(2);
        student.setName("埃龙马克思");
        student.setAge(40);
        student.setEmail("SPEACEX@MOVIE.COM");
        int result = studentService.addStudent(student);
        //spring框架集成mybatis框架，事务自动提交，无需执行 sqlSession的commit()！！！
        System.out.println("影响"+result+"条记录行数");
    }
    @Test
    public void testStudentServiceQueryStudents() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取spring容器中的SERVICE对象
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
        List<Student> studentList = studentService.queryStudents();
        //spring框架集成mybatis框架，事务自动提交，无需执行 sqlSession的commit()！！！
       studentList.forEach(student -> System.out.println("学生信息："+student));
    }
}
