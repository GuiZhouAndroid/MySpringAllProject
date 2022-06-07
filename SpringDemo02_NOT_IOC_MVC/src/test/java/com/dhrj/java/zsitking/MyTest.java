package com.dhrj.java.zsitking;


import com.dhrj.java.zsitking.controller.UserController;
import com.dhrj.java.zsitking.pojo.User;
import org.junit.Test;

/**
 * created by on 2022/6/7
 * 描述：测试三层架构搭建的项目
 *
 * @author ZSAndroid
 * @create 2022-06-07-14:43
 */
public class MyTest {
    @Test
    public void test01() {
        System.out.println(new UserController().addUser(new User(1998, "张松", 24)));
    }
}
