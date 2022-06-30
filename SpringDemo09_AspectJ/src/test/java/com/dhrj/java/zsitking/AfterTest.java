package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.after.AfterService;
import com.dhrj.java.zsitking.afterreturn.AfterReturningService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created: by 2022-06-30 10:07
 * @Description: 最终通知
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public class AfterTest {
    @Test
    public void testAfter() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("after/applicationContext.xml");
        AfterService afterService = (AfterService) ac.getBean("afterServiceImpl");
        System.out.println("后置通知绑定切面后的对象类型：" + afterService.getClass());
        System.out.println("最终返回值："+afterService.myInfo("张松",24));
    }
}
