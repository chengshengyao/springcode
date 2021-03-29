package com.bjpowernode.dao;

import com.bjpowernode.domain.Sale;

/**
 * @ProjectName: spring-course
 * @Package: com.bjpowernode.dao
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/14 16:42
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
//描述 访问数据库ssm中的sale表 的对象的抽象行为
public interface SaleDao {
    //插入行记录
    int insertSale(Sale sale);
    //
}
