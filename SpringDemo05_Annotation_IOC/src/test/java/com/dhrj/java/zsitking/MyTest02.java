package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.byautowired.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by on 2022/6/8
 * 描述：测试@Autowired按类型自动注入
 *
 * @author ZSAndroid
 * @create 2022-06-08-15:30
 */
public class MyTest02 {
    /**
     * 使用注解@Autowired方式按类型自动注入
     */
    @Test
    public void test01() {
        //1.创建Spring容器并启动
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("byautowired/applicationContext.xml");
        //2.取出对象
        Student student = (Student) applicationContext.getBean("myStudent");//默认对象名称
        //3.打印结果
        System.out.println(student);//Student{name='张松', age=24, school=School{name='六盘水师范学院', address='六盘水市明湖公园'}}
    }
}
