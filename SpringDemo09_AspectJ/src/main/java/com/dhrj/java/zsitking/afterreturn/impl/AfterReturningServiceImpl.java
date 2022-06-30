package com.dhrj.java.zsitking.afterreturn.impl;

import com.dhrj.java.zsitking.afterreturn.AfterReturningService;
import com.dhrj.java.zsitking.afterreturn.People;
import org.springframework.stereotype.Service;

/**
 * @Created: by 2022-06-30 15:37
 * @Description:后置通知业务接口实现
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Service //Spring的IOC注解式创建业务逻辑层实例
public class AfterReturningServiceImpl implements AfterReturningService {

    @Override
    public String myName(String name) {
        System.out.println("AfterReturningServiceImpl中myName(String name)已执行...");
        return "我的姓名：" + name;
    }

    @Override
    public People myAge(int age) {
        System.out.println("AfterReturningServiceImpl中myAge(int age)已执行...");
        return new People(age);
    }
}
