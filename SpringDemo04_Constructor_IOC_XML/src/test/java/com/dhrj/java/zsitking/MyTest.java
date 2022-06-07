package com.dhrj.java.zsitking;

import com.dhrj.java.zsitking.pojo.School;
import com.dhrj.java.zsitking.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by on 2022/6/7
 * 描述：测试实体构造方法使用Spring容器注入对象值
 *
 * @author ZSAndroid
 * @create 2022-06-07-16:59
 */
public class MyTest {

    /**
     * 使用构造方法的参数名称进行注入值
     */
    @Test
    public void test01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        School mySchool = (School) applicationContext.getBean("mySchoolByParam");
        System.out.println(mySchool);
    }

    /**
     * 使用构造方法参数的下标注入值
     */
    @Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("myStudentByIndex");
        System.out.println(student);
    }

    /**
     * 使用默认的构造方法的参数的顺序注入值
     */
    @Test
    public void test03() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("myStudentByParamOrder");
        System.out.println(student);
    }
}
