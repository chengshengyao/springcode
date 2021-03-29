package com.bjpowernode.service;

import com.bjpowernode.domain.SysUser;

/**
 * 【service包】中: 业务对象
 * UserService业务对象接口
 * 添加用户信息的抽象方法描述
 * 参数类型：【domain包下的实体对象】
 */
public interface UserService {

    void addUser(SysUser user);
}
