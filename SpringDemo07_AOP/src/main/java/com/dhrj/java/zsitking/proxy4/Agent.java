package com.dhrj.java.zsitking.proxy4;

/**
 * created by on 2022/6/10
 * 描述：静态代理实现AOP
 *
 * @author ZSAndroid
 * @create 2022-06-10-10:56
 */
public class Agent implements Service {

    //传入目标(业务)对象,切面对象
    Service target;
    AOP aop;

    //使用构造方法初始化业务对象和切面对象
    public Agent(Service target, AOP aop) {
        this.target = target;
        this.aop = aop;
    }

    @Override
    public void buy() {
        try {
            //切面
            aop.before();  //事务  日志
            //业务
            target.buy();  //图书  商品
            //切面
            aop.after();   //事务

        } catch (Exception e) {
            //切面
            aop.exception();
        }

    }
}

