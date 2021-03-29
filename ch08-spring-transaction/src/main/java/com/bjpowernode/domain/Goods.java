package com.bjpowernode.domain;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.domain
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/14 16:31
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
//商品表
public class Goods {
    //商品编号
    private Integer id;
    //商品名称
    private String name;
    //商品库存
    private  Integer amount;
    //商品单价
    private Float price;

    //getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
