package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.around.AroundService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created: by 2022-06-30 10:07
 * @Description: 环绕通知测试类
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public class AroundTest {
    @Test
    public void testAround() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("around/applicationContext.xml");
        AroundService aroundServiceImpl = (AroundService) ac.getBean("aroundServiceImpl");
        System.out.println("环绕通知最终返回值：" + aroundServiceImpl.myInfo("张松", 20));
    }
}
