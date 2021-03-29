package com.bjpowernode.service;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.service
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/14 17:24
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
//描述用户业务操作的抽象行为
public interface BuyGoodsService {
    //购买商品业务抽象行为 goodsId：购买商品编号 nums：购买数量
    void buy(Integer goodsId, Integer nums);
}
