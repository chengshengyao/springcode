package com.bjpowernode.controller;
/**
 * @ProjectName: spring-course
 * @Package: ${PACKAGE_NAME}
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/15 11:51
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strId = request.getParameter("id");
        String strName = request.getParameter("name");
        String strEmail = request.getParameter("email");
        String strAge = request.getParameter("age");
        //创建spring的容器对象
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //org.springframework.context.support.ClassPathXmlApplicationContext@63775579, started on Fri Jan 15 14:20:44 CST 2021
        //org.springframework.context.support.ClassPathXmlApplicationContext@42591702, started on Fri Jan 15 14:25:10 CST 2021


//        WebApplicationContext applicationContext = null;
//        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
//        Object attribute = getServletContext().getAttribute(key);
//        if (attribute != null) {
//            applicationContext = (WebApplicationContext) attribute;
//        }

        //使用框架中的方法，获取容器对象
        ServletContext sc =getServletContext();
        WebApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
        System.out.println("容器对象的信息" + applicationContext);
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        Student student = new Student();
        student.setId(Integer.valueOf(strId));
        student.setName(strName);
        student.setEmail(strEmail);
        student.setAge(Integer.valueOf(strAge));
        studentService.addStudent(student);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
