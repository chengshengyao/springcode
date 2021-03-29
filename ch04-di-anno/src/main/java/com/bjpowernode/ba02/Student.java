package com.bjpowernode.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
 *     注解属性（value表示对象的名称） == <bean id=“对象名称” class=“com.bjpowernode.ba01.Student”>
 *         值唯一 创建的对象唯一
 *         注解位置：位于类的上方
 *
 */
//使用value指定对象名称
//@Component(value = "createStudent")
    //@Component 不指定对象名称 默认创建 生成类型小写的对象名称
@Component("createStudent2")//可省略value

public class Student {
    /**
     * Value： 简单类型属性进行赋值
     *位于在进行赋值的属性上
     * 无需set方法也可进行赋值
     * 存在set方法时可以放置于set方法上方进行对简单类型属性的赋值
     */
    @Value(value = "张飞")
    private String name;
    @Value(value = "29")
    private Integer age;

    public Student() {
        System.out.println("fuck");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
