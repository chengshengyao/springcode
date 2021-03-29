package com.bjpowernode.ba01;

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
@Component("createStudent1")//可省略value

public class Student {
    private String name;
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
