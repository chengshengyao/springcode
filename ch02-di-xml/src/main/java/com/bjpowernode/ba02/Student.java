package com.bjpowernode.ba02;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.ba01
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/10 15:50
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class Student {
    private String name;
    private Integer age;
    //声明引用类型
    private School school;

    public void setSchool(School school) {
        System.out.println("Student类中引用类型的setSchool"+school);
        this.school = school;
    }

    public Student() {

    }

    @Override
    public String  toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setName(String name) { this.name = name; }

    public void setAge(Integer age) {
        this.age = age;
    }


}
