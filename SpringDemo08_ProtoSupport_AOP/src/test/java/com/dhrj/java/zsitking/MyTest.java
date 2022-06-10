package com.dhrj.java.zsitking;


import com.dhrj.java.zsitking.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService proxy = (BookService) ac.getBean("bookService");
        System.out.println(proxy.getClass());
        proxy.buy("张松", "露娜月下无限连", 666);
        proxy.comment("张松", "省级露娜冲国服露娜...");
    }
}
