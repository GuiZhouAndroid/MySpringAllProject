package com.dhrj.java.zsitking;


import com.dhrj.java.zsitking.controller.UserController;
import com.dhrj.java.zsitking.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by on 2022/6/7
 * 描述：测试基于Spring常用注解搭建三层架构的项目
 *
 * @author ZSAndroid
 * @create 2022-06-07-14:43
 */
public class MyTest {
    @Test
    public void test01() {
        // 1.创建并启动容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("totalContext.xml");
        // 2.取出对象
        UserController userController = (UserController) applicationContext.getBean("userController");
        // 3.测试功能
        userController.addUser(new User(1998, "张松", 24));

    }
}
