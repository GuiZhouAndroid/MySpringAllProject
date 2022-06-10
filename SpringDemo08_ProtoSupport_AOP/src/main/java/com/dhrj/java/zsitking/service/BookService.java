package com.dhrj.java.zsitking.service;

/**
 * created by on 2022/6/10
 * 描述：买书业务接口
 *
 * @author ZSAndroid
 * @create 2022-06-10-11:47
 */
public interface BookService {
    //买书的人 + 书名 + 单价
    public boolean buy(String userName, String bookName, double price);

    //买书的人 + 下单备注
    public void comment(String userName, String comments);
}
