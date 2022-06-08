package com.dhrj.java.zsitking.byfatherson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * created by on 2022/6/8
 * 描述：子学校
 *
 * @author ZSAndroid
 * @create 2022-06-08-15:51
 */
@Component("SonSchool")
public class SonSchool extends School{
    @Value("子六盘水师范学院")
    private String name;
    @Value("子六盘水市明路公园")
    private String address;

    public SonSchool() {
        System.out.println("这是SonSchool子类的构造方法......");
    }

    @Override
    public String toString() {
        return "SonSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
