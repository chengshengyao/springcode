package com.bjpowernode;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/9 19:11
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class MyTest {
    @Test
    public void testSomeServiceImpl() {
        //使用new关键字 传统的方式创建对象
        SomeService service = new SomeServiceImpl();//面向接口编程 耦合度高
        service.doSome();
    }

    //    使用spring容器创建的对象
    //      spring创建对象时默认使用反射调用所创建对象的无参构造
    @Test
    public void testSpringCreateObj() {
        //第一步 ： 指定spring的配置文件名称
        String config = "beans.xml";
        //第二部： 创建表示spring框架【容器】所用于创建对象的AppicationContext。、
        // 读取配置文件【】创建获取对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //第三步：通过调用应用程序来龙去脉的【获取咖啡豆】方法，从Map中KEY获取V【对象】
        SomeService bean = (SomeService) applicationContext.getBean("SomeServiceImpl");//这是ID的值
        //使用spring创建好的对象调用实现类中的方法
        bean.doSome();
    }

    //获取spring框架容器中的java对象 【咖啡豆】的信息
    //ClassPathXmlApplicationContext是一个容器【关于对xml路径进行解析其内容的接口容器】
    //返回值可是一个实现类 ApplicationContext
    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //spring框架容器提供了获取其中定义对象的数量的方法
        int count = context.getBeanDefinitionCount();
        System.out.println("spring框架容器中定义了" + count + "颗咖啡豆");
        //spring框架容器提供了获取定义每颗咖啡豆名称的方法
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
    Arrays.stream(beanDefinitionNames).iterator().forEachRemaining(s -> System.out.println("容器中对象："+s));
    }

    //spring 容器 依赖注入获取 日期咖啡豆
    @Test
    public void testSpringCreateDate() {
        //第一步 ： 指定spring的配置文件名称
        String config = "beans.xml";
        //第二部： 创建表示spring框架【容器】所用于创建对象的AppicationContext。、
        // 读取配置文件【】创建获取对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //第三步：通过调用应用程序来龙去脉的【获取咖啡豆】方法，从Map中KEY获取V【对象】
        Date bean = (Date) applicationContext.getBean("date");//这是ID的值
        //使用spring创建好的对象调用实现类中的方法
        System.out.println(bean);
    }
}
