package com.bjpowernode.util;

import java.util.Date;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.util
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/12 11:06
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */

/**
 * 切面的功能代码
 * 1.日志切面功能
 * 2.事务切面功能
 */
public class ServiceTools {
    public static  void doLog(){
        System.out.println("time" + new Date());
    }
    public static  void doTrans(){
        System.out.println("事务提交");
    }
}
