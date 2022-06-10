package com.dhrj.java.zsitking.proxy5;

/**
 * created by on 2022/6/10
 * 描述：买书的业务接口
 *
 * @author ZSAndroid
 * @create 2022-06-10-10:26
 */
public interface Service {
    //规定业务功能
    void buy();
    //增加有参有返回值的方法测试代理功能
    default String show(int age){return null;}
}
