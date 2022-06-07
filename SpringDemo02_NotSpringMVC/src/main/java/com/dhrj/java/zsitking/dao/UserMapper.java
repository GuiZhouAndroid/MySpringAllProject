package com.dhrj.java.zsitking.dao;


import com.dhrj.java.zsitking.pojo.User;

/**
 * created by on 2022/6/7
 * 描述：用户数据访问层接口
 *
 * @author ZSAndroid
 * @create 2022-06-07-14:19
 */
public interface UserMapper {
    //添加用户
    int addUser(User user);
}
