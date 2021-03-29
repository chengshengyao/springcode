package com.bjpowernode.dao;

import com.bjpowernode.domain.SysUser;

public interface UserDao {
    /**
     * DAO中表示对数据库的操作【增删改查】
     * UserDao接口中的抽象方法描述了：以domain包中的实体类为参数 对数据库进行插入操作
     * @param user domain包中的实体类为参数
     */
    void insertUser(SysUser user);
}
