package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.proxy4.*;
import org.junit.Test;

/**
 * created by on 2022/6/10
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-06-10-10:18
 */
public class MyTest04 {
    @Test
    public void test04() {
        Service agent = new Agent(new BookServiceImpl(), new TransAop());//实现套切面
        Service agent1 = new Agent(agent, new LogAop());//切面套切面
        agent1.buy();
    }
}
