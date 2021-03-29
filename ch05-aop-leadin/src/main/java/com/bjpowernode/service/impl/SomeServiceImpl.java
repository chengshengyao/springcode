package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.util.ServiceTools;

import java.util.Date;


/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/12 10:44
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */

/**
 * service类的代码不进行修改，也能增加输出时间事务的提交。
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
//        执行时机
//        ServiceTools.doLog();
//         执行方法
        System.out.println("执行业务方法DoSome");
//        事务提交
//        ServiceTools.doTrans();

    }

    @Override
    public void doOther() {
        //        执行时机
//        ServiceTools.doLog();
//         执行方法
        System.out.println("执行业务方法DoOther");
//        事务提交
//        ServiceTools.doTrans();
    }
}
