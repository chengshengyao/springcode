package com.bjpowernode.service.impl;

import com.bjpowernode.dao.GoodsDao;
import com.bjpowernode.dao.SaleDao;
import com.bjpowernode.domain.Goods;
import com.bjpowernode.domain.Sale;
import com.bjpowernode.excep.NotEnoughException;
import com.bjpowernode.service.BuyGoodsService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/14 17:29
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
//实现用户业务操作的行为
public class BuyGoodsServiceImpl implements BuyGoodsService {
    // ！业务层  持久层间建立联系： 通过持久层接口作为引用类型属性！
    private GoodsDao goodsDao;
    private SaleDao saleDao;
    //提供set（） 以完成 设置注入
    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }


    /**
     * propagation 事务传播行为
     *isolation 事务隔离级别
     * rollbackFor表示发生指定的异常一定回滚
     * 1）rollbackFor的处理逻辑 spring先检查业务方法抛出的异常 是否在 rollbackFor的属性值范围内
     * 若在属性值范围内，一定执行事务回滚
     * 2）若抛出的异常不在属性值范围内，spring会进行判断该异常是否为 RunTimeException，若是一定回滚
     */

//    @Transactional(propagation = Propagation.REQUIRED,
//    isolation = Isolation.DEFAULT,
//    readOnly = false,
//    rollbackFor = {
//            NullPointerException.class,NotEnoughException.class
//    })
    //使用的是事务控制的默认值
    //默认抛出运行时异常，执行事务的回滚操作
    @Transactional
    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("$$$$$$$$$BUY方法的开始$$$$$$$$$");
        //记录销售记录，向sale表添加记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);
        //更新商品库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if ( goods == null){
            throw new NullPointerException("商品信息是"+goodsId+"的商品不存在！");
        }
        else if (goods.getAmount()<nums){
            //商品库存不足
            throw new NotEnoughException("商品信息是"+goodsId+"的库存不足！");
        }
        //满足以上条件修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("$$$$$$$$$BUY方法的完成$$$$$$$$$");
    }
}
