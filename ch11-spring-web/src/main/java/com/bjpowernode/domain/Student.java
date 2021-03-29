package com.bjpowernode.domain;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.domain
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/13 17:02
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class Student {
    //属性名与列名一致，目的图个方便
    private Integer id;
    private String name;
    private String email;
    private Integer age;

    //构造


    public Student() {
    }

    public Student(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    //toString
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    //getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
