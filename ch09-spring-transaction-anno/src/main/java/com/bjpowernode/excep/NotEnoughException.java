package com.bjpowernode.excep;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.excep
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/14 20:10
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
//自定义运行时异常
public class NotEnoughException extends RuntimeException{
    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
