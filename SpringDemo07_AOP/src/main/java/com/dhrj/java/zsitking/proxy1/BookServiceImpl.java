package com.dhrj.java.zsitking.proxy1;

/**
 * created by on 2022/6/10
 * 描述：图书购买业务和事务切面耦合在一起
 *
 * @author ZSAndroid
 * @create 2022-06-10-10:12
 */

public class BookServiceImpl {

    public void buy() {

        try {
            System.out.println("事务开启.......");
            System.out.println("图书购买业务功能实现...........");
            System.out.println("事务提交.......");
        } catch (Exception e) {
            System.out.println("事务回滚.......");
        }
    }
}
