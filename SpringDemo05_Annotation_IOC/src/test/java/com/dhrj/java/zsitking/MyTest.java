package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.s1.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by on 2022/6/7
 * 描述：测试基于注解包扫描Spring注入的实例对象
 *
 * @author ZSAndroid
 * @create 2022-06-07-17:53
 */
public class MyTest {
    /**
     * 注解方式创建学生对象
     */
    @Test
    public void test01() {
        //1.创建Spring容器并启动
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.取出对象
        //Student student = (Student) applicationContext.getBean("student");//默认对象名称
        Student student = (Student) applicationContext.getBean("myStudent");//默认对象名称
        //3.打印结果
        System.out.println(student);//Student{name='张松', age=24}
    }
}
