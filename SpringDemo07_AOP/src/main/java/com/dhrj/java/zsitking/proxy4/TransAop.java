package com.dhrj.java.zsitking.proxy4;

/**
 * created by on 2022/6/10
 * 描述：事务切面
 *
 * @author ZSAndroid
 * @create 2022-06-10-10:53
 */
public class TransAop implements AOP {
    @Override
    public void before() {
        System.out.println("事务开启........");
    }

    @Override
    public void after() {
        System.out.println("事务提交........");
    }

    @Override
    public void exception() {
        System.out.println("事务回滚........");
    }
}

