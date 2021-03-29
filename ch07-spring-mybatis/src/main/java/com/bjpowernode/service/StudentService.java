package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.service
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/13 18:56
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public interface StudentService {
    //描述学生信息添加的方法---》DAO INSERT
    int addStudent(Student student);
    //描述学生信息查询的方法---》DAO SELECT
    List<Student> queryStudents();
}
