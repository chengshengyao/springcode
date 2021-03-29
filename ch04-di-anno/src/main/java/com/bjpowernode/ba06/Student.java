package com.bjpowernode.ba06;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.ba01
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/11 20:29
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */

/**
 * Component【元件】:创建对象等同于<bean>
 * 注解属性（value表示对象的名称） == <bean id=“对象名称” class=“com.bjpowernode.ba01.Student”>
 * 值唯一 创建的对象唯一
 * 注解位置：位于类的上方
 */
//使用value指定对象名称
//@Component(value = "createStudent")
//@Component 不指定对象名称 默认创建 生成类型小写的对象名称
@Component("createStudent6")//可省略value
public class Student {
    /**
     * Value： 简单类型属性进行赋值
     * 位于在进行赋值的属性上
     * 无需set方法
     */
    @Value(value = "程生尧")
    private String name;
    @Value(value = "20")
    private Integer age;
    /**
     *Resource是jdk提供的注解，
     * 用于对引用类型赋值，自动注入原理 支持byName（默认） byType
     * 位与引用类型属性上方，无需set
     *处理 先byName 再byType
     */
    @Resource
    private School school;

    public Student() {
        System.out.println("fuck");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
