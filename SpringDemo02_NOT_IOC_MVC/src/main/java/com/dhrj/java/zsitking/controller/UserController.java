package com.dhrj.java.zsitking.controller;


import com.dhrj.java.zsitking.pojo.User;
import com.dhrj.java.zsitking.service.UserService;
import com.dhrj.java.zsitking.service.impl.UserServiceImpl;

/**
 * created by on 2022/6/7
 * 描述：用户界面层
 *
 * @author ZSAndroid
 * @create 2022-06-07-14:36
 */
public class UserController {
    // 在所有界面层中都必定有业务逻辑层的对象
    private UserService userService = new UserServiceImpl();

    /**
     * 界面层的功能实现，对外提供访问的功能
     *
     * @param user 待添加的用户信息
     * @return 添加结果
     */
    public int addUser(User user) {
        return userService.addUser(user);
    }
}
