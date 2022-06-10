package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.proxy2.BookServiceImpl;
import com.dhrj.java.zsitking.proxy2.SubBookServiceImpl;
import org.junit.Test;

/**
 * created by on 2022/6/10
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-06-10-10:18
 */
public class MyTest02 {
    @Test
    public void test02(){
        BookServiceImpl service = new SubBookServiceImpl();
        service.buy();
    }
}
