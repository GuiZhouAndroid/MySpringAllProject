package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.afterreturn.AfterReturningService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created: by 2022-06-30 10:05
 * @Description:后置通知测试类
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public class AfterReturnTest {
    @Test
    public void testAfterReturning1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("afterreturn/applicationContext.xml");
        AfterReturningService afterReturningService = (AfterReturningService) ac.getBean("afterReturningServiceImpl");
        System.out.println("后置通知绑定切面后的对象类型：" + afterReturningService.getClass());
        System.out.println("最终返回值："+afterReturningService.myName("ZhangSong"));
    }
    @Test
    public void testAfterReturning2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("afterreturn/applicationContext.xml");
        AfterReturningService afterReturningService = (AfterReturningService) ac.getBean("afterReturningServiceImpl");
        System.out.println("后置通知绑定切面后的对象类型：" + afterReturningService.getClass());
        System.out.println("最终返回改变的People年龄："+afterReturningService.myAge(24).getAge());
    }
}
