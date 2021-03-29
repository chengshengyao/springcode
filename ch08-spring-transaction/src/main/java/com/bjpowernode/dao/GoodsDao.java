package com.bjpowernode.dao;

import com.bjpowernode.domain.Goods;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.dao
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/14 16:57
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
//描述 访问数据库ssm中的goods表 的对象的抽象行为
public interface GoodsDao {
    //更新行记录
    int updateGoods(Goods goods);

    //查询行记录
    Goods selectGoods(Integer id);
}

