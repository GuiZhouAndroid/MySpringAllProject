package com.dhrj.java.zsitking;


import com.dhrj.java.zsitking.controller.UserController;
import com.dhrj.java.zsitking.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        //1.创建容器并启动加载bean对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.取出对象
        UserController uController = (UserController) ac.getBean("uController");
        //3.测试对象功能
        System.out.println(uController.addUser(new User(1998, "张松", 24)));
    }
}
