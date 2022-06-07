package com.dhrj.java.zsitking.service.impl;


import com.dhrj.java.zsitking.dao.UserMapper;
import com.dhrj.java.zsitking.pojo.User;
import com.dhrj.java.zsitking.service.UserService;

/**
 * created by on 2022/6/7
 * 描述：用户业务逻辑层实现类
 *
 * @author ZSAndroid
 * @create 2022-06-07-14:31
 */
public class UserServiceImpl implements UserService {

    // 在所有业务逻辑层中都必定有数据访问层的对象
    private UserMapper userMapper;//new UserMapperImpl();

    //提供setter()方法交由Spring容器beans工厂(applicationContext.xml)管理数据访问层的对象
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
