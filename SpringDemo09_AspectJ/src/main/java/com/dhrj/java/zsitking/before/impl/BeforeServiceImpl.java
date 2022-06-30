package com.dhrj.java.zsitking.before.impl;

import com.dhrj.java.zsitking.before.BeforeService;
import org.springframework.stereotype.Service;

/**
 * @Created: by 2022-06-30 10:17
 * @Description:前置通知业务接口实现
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Service //Spring的IOC注解式创建业务逻辑层实例
public class BeforeServiceImpl implements BeforeService {
    @Override
    public void beforeMethod() {
        System.out.println("前置通知业务接口实现");
    }

    @Override
    public String myInfo(String name, int age) {
        return "我的个人信息 = 姓名：" + name + "，年龄：" + age;
    }
}
