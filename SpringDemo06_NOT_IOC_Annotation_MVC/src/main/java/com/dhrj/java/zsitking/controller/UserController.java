package com.dhrj.java.zsitking.controller;


import com.dhrj.java.zsitking.pojo.User;
import com.dhrj.java.zsitking.service.UserService;
import com.dhrj.java.zsitking.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * created by on 2022/6/7
 * 描述：用户界面层
 *
 * @author ZSAndroid
 * @create 2022-06-07-14:36
 */
@Controller //专门用来交给Spring框架创建控制器的对象(Servlet)，这种对象可以接收用户的请求，可以返回处理结果给客户端.
public class UserController {
    // 在所有界面层中都必定有业务逻辑层的对象
    @Autowired
    private UserService userService;

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
