package com.bjpowernode.domain;

/**
 * 默认 通过service 类调用 dao类完成 SysUser插入到数据库的操作
 * 【domain 用户实体类-->entity 代表数据库中的数据】
 * 其中提供：1.成员属性的声明
 *         2.成员属性的set方法
 */
public class SysUser {
    //成员属性
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
