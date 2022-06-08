package com.dhrj.java.zsitking.byautowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * created by on 2022/6/8
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-06-08-15:25
 */
@Component("mySchool")  //交给Spring去创建对象
public class School {  //此时School对象的名称就是mySchool
    @Value("六盘水师范学院")
    private String name;
    @Value("六盘水市明湖公园")
    private String address;

    public School() {
        System.out.println("School的无参的构造方法.........");
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
