package com.dhrj.java.zsitking.proxy4;

/**
 * created by on 2022/6/10
 * 描述：日志切面
 *
 * @author ZSAndroid
 * @create 2022-06-10-10:52
 */
public class LogAop implements AOP {
    @Override
    public void before() {
        System.out.println("前置日志输出.......");
    }
}
