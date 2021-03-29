package com.bjpowernode.ba01;

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

    public Student() {
        System.out.println("结论：框架容器是进行反射创建对象，并先执行其构造方法");
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
        System.out.println("在自定义类的set（）中写下这句话，以此证明，通过Spring配置文件中对：" +
                "对象的属性进行赋值时，调用此方法");
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // 此处 进行论证： 非对象声明属性 是否 可通过设置注入进行 对象属性的赋值
    public void setEmail(String email) {
        System.out.println("此处所证明结论：此方法非对象声明属性的相似方法名的set方法，在进行执行Xml的读取时，所处理方式" +
                "property标签只是进行了参数的传递与赋值，并对应找set方法名，此方法没有被调用但是还是被当做SET放法去执行");
        System.out.println("email=" + email);
    }
}
