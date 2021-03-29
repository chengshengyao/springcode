package com.bjpowernode.service.impl;

import com.bjpowernode.dao.GoodsDao;
import com.bjpowernode.dao.SaleDao;
import com.bjpowernode.domain.Goods;
import com.bjpowernode.domain.Sale;
import com.bjpowernode.excep.NotEnoughException;
import com.bjpowernode.service.BuyGoodsService;

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
