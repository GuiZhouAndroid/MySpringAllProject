package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.before.BeforeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created: by 2022-06-30 10:05
 * @Description:前置通知测试类
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public class BeforeTest {

    private BeforeService beforeService;

    @Before //junit
    public void before() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("before/applicationContext.xml");
        beforeService = (BeforeService) ac.getBean("beforeServiceImpl");
        System.out.println("绑定切面后的对象类型：" + beforeService.getClass());
    }

    @Test
    public void testBefore01() {
        beforeService.beforeMethod();
    }

    @Test
    public void testBefore02() {
        System.out.println(beforeService.myInfo("张松", 24));
    }
}
