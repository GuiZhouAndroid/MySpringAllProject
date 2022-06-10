package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.proxy5.*;
import org.junit.Test;

/**
 * created by on 2022/6/10
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-06-10-11:11
 */
public class MyTest05 {
    @Test
    public void test05() {
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(), new TransAop());
        agent.buy();
    }
    @Test
    public void test06(){
        //得到动态代理对象
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(),new LogAop());
        System.out.println(agent.getClass());
        String s = agent.show(24);
        System.out.println(s);
    }
}
