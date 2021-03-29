package com.bjpowernode.ba06;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.ba02
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/10 18:23
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class School {
    private String name;
    private String add;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
