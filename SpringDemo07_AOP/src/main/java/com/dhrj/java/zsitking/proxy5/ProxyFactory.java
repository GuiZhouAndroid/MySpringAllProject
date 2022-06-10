package com.dhrj.java.zsitking.proxy5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * created by on 2022/6/10
 * 描述：动态代理工厂
 *
 * @author ZSAndroid
 * @create 2022-06-10-11:06
 */
public class ProxyFactory {

    public static Object getAgent(Service target, AOP aop) {
        //返回生成的动态代理对象
        return Proxy.newProxyInstance(
                //类加载器
                target.getClass().getClassLoader(),
                //目标对象实现的所有的接口
                target.getClass().getInterfaces(),
                //代理功能实现
                new InvocationHandler() {
                    @Override
                    public Object invoke(
                            //生成的代理对象
                            Object proxy,
                            //正在被调用的目标方法buy(),show()
                            Method method,
                            //目标方法的参数
                            Object[] args) throws Throwable {
                        Object obj = null;
                        try {
                            //切面
                            aop.before();  //事务  日志
                            //业务
                            obj = method.invoke(target, args);
                            //切面
                            aop.after();
                        } catch (Exception e) {
                            //切面
                            aop.exception();
                        }

                        return obj; //目标方法的返回值
                    }
                }
        );
    }
}

