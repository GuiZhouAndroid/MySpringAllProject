package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.proxy3.Agent;
import com.dhrj.java.zsitking.proxy3.BookServiceImpl;
import com.dhrj.java.zsitking.proxy3.Service;
import org.junit.Test;

/**
 * created by on 2022/6/10
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-06-10-10:18
 */
public class MyTest03 {
    @Test
    public void test03() {
        Service service = new Agent(new BookServiceImpl());
        service.buy();
    }
}
