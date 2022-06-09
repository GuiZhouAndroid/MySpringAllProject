package com.dhrj.java.zsitking.service.impl;


import com.dhrj.java.zsitking.dao.UserMapper;
import com.dhrj.java.zsitking.dao.impl.UserMapperImpl;
import com.dhrj.java.zsitking.pojo.User;
import com.dhrj.java.zsitking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by on 2022/6/7
 * 描述：用户业务逻辑层实现类
 *
 * @author ZSAndroid
 * @create 2022-06-07-14:31
 */
@Service //专门用来交给Spring框架创建业务逻辑层的对象，负责向下访问数据访问层，处理完毕后的结果返回给界面层.
public class UserServiceImpl implements UserService {

    // 在所有业务逻辑层中都必定有数据访问层的对象
    @Autowired
    private UserMapper UserMapper;

    @Override
    public int addUser(User user) {
        return UserMapper.addUser(user);
    }
}
