package com.dhrj.java.zsitking.bycomponent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * created by on 2022/6/7
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-06-07-17:41
 */
@Component("myStudent") //创建的对象的默认名称是类名的驼峰命名法.也可以指定对象的名称@Component("指定名称")
public class Student {
    @Value("张松")
    private String name;
    @Value("24")
    private int age;

    public Student() {
        System.out.println("Spring注解方式创建学生对象的无参构造执行了...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

