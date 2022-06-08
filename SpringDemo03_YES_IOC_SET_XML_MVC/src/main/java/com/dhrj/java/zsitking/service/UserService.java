package com.dhrj.java.zsitking.service;


import com.dhrj.java.zsitking.pojo.User;

/**
 * created by on 2022/6/7
 * 描述：用户业务逻辑层接口
 *
 * @author ZSAndroid
 * @create 2022-06-07-14:31
 */
public interface UserService {
    //添加用户
    int addUser(User user);
}
