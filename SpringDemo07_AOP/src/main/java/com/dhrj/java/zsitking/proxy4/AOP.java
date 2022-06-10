package com.dhrj.java.zsitking.proxy4;

/**
 * created by on 2022/6/10
 * 描述：面向切面接口
 *
 * @author ZSAndroid
 * @create 2022-06-10-10:50
 */
public interface AOP {
    default void before(){}
    default void after(){}
    default void exception(){}
}
