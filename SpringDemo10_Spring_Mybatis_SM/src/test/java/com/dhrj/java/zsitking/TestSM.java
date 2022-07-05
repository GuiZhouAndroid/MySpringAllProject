package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.entity.Accounts;
import com.dhrj.java.zsitking.entity.Users;
import com.dhrj.java.zsitking.service.AccountsService;
import com.dhrj.java.zsitking.service.UsersService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created: by 2022-07-01 19:32
 * @Description:
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public class TestSM {

    private ApplicationContext ac;

    @Before
    public void before() {
        //1.创建容器并启动
        ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
    }
    @Test
    public void testUsers() {
        //2.取出UsersServiceImpl
        UsersService uService = (UsersService) ac.getBean("usersServiceImpl");
        int num = uService.addUsers(new Users(1998,"张松","root"));
        System.out.println(num);
    }

    @Test
    public void testAccounts()  {
        //2.取出UsersServiceImpl
        AccountsService accountsService = (AccountsService) ac.getBean("accountsServiceImpl");
        System.out.println("accountsService单例bean对象的类型"+accountsService.getClass());
        int num = accountsService.addAccounts(new Accounts(666,"张松的账户666","账户余额666"));
        System.out.println(num);
    }
}
