package com.dhrj.java.zsitking.proxy5;

/**
 * created by on 2022/6/10
 * 描述：目标对象:业务功能的具体实现
 *
 * @author ZSAndroid
 * @create 2022-06-10-10:28
 */
public class BookServiceImpl implements Service {
    @Override
    public void buy() {
        System.out.println("图书购买业务功能实现...");
    }
    @Override
    public String show(int age) {
        System.out.println("show()方法被调用...."+age);
        return "show()方法被调用";
    }
}
