package com.bjpowernode.domain;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.domain
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/14 16:27
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
//销售表
public class Sale {
    //主键id
    private Integer id;
    //商品编号
    private Integer gid;
    //销售数量
    private Integer nums;


    //getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }
}
