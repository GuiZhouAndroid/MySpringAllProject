package com.dhrj.java.zsitking.dao.impl;


import com.dhrj.java.zsitking.dao.UserMapper;
import com.dhrj.java.zsitking.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * created by on 2022/6/7
 * 描述：用户数据访问层接口实现类
 *
 * @author ZSAndroid
 * @create 2022-06-07-14:23
 */
@Repository //专门用来交给Spring框架创建数据访问层的对象，负责数据库中的增删改查所有操作.
public class UserMapperImpl implements UserMapper {
    @Override
    public int addUser(User user) {
        System.out.println(user.getUserName() + "用户数据添加成功...");
        return 1;
    }
}
