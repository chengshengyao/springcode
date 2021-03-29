package com.bjpowernode.dao;


import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.dao
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/13 17:07
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public interface OrderDao {
    //描述访问数据库进行插入
    int insertStudent(Student student);
    //描述访问数据库进行查询
    List<Student> selectStudents();
}
