package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;

import java.util.List;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/13 19:00
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */

public class StudentServiceImpl implements StudentService {
   //引用类型DAO
    private StudentDao studentDao;
    //使用设置注入赋值
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int result = studentDao.insertStudent(student);
        return result;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> studentList = studentDao.selectStudents();
        return studentList;
    }

}
