package com.bjpowernode.ba06;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
@Component(value = "createSchool4")
public class School {
    @Value("北京邮电大学")
    private String name;
    @Value("宇宙中心五道口")
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
