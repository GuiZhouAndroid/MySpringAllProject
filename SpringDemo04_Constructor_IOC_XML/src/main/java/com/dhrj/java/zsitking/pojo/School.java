package com.dhrj.java.zsitking.pojo;

/**
 * created by on 2022/6/7
 * 描述：学校实体类
 *
 * @author ZSAndroid
 * @create 2022-06-07-16:45
 */
public class School {
    private String sName;
    private String sAddress;

    //没有提供setXXX()方法
    //使用带参构造方法通过Spring容器注入值到IOC创建的实例对象————>注意：覆盖无参构造方法
    public School(String sName, String sAddress) {
        this.sName = sName;
        this.sAddress = sAddress;
    }

    @Override
    public String toString() {
        return "School{" +
                "sName='" + sName + '\'' +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }
}
