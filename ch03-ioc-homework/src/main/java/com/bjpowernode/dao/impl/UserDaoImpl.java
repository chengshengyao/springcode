package com.bjpowernode.dao.impl;

import com.bjpowernode.dao.UserDao;
import com.bjpowernode.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
public class UserDaoImpl implements UserDao {
    /**
     * UserDao接口的实现类实际对数据库进行插入操作的方法 insertUser(SysUser user)
     * @param user domain包中的实体类为参数
     * 实现类中重写抽象方法
     */
    @Override
    public void insertUser(SysUser user) {
        //模拟对数据库的操作
        System.out.println("user插入到mysql数据库");
    }
}
