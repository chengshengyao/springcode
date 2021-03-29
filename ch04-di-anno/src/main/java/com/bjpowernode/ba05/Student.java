package com.bjpowernode.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
@Component("createStudent5")//可省略value
public class Student {
    /**
     * Value： 简单类型属性进行赋值
     *位于在进行赋值的属性上
     * 无需set方法
     */
    @Value(value = "程生尧")
    private String name;
    @Value(value = "20")
    private Integer age;
    /**
     * Autowired spring提供的注解，实现引用类型属性 进行自动赋值
     *自动注入原理
     * Autowired 默认使用ByTape自动注入
     * 位置 属性定义的上面，无需set方法
     *      或位于set（）方法上
     *      属性 required【必须】表示引用类型属性是必须的，否则报错 默认为TRUE
     *                         若值为false，则程序依然执行，对引用类型属性赋空值
     */
    @Autowired
    @Qualifier(value = "createSchool3")
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
