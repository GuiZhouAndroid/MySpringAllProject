package com.dhrj.java.zsitking.byfatherson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * created by on 2022/6/8
 * 描述：学生对象
 *
 * @author ZSAndroid
 * @create 2022-06-08-15:26
 */
@Component
public class Student {
    @Value("张松")
    private String name;
    @Value("24")
    private int age;

    //引用类型注入
    //父子类按类型进行注入值，意味着有多个可注入对象.此时按照名称进行二次筛选,匹配选中与被注入对象(private School school;)相同名称对象@Component("相同名称对象school")进行注入
    @Autowired
    //使用名称注入值，从整个Bean工厂中搜索相同名称的对象进行注入。
    @Qualifier("SonSchool")//父子类情况直接按名称进行注入值.
    private School school; //在学生对象当中，被注入的引用类型School对象

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}

