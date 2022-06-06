package com.dhrj.java.zsking;

import com.dhrj.java.zsking.pojo.Book;
import com.dhrj.java.zsking.pojo.Student;
import com.dhrj.java.zsking.pojo.StudentAndBook;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by on 2022/6/6
 * 描述：Spring测试————由spring容器“控制反转(IOC)”进行对象的创建
 *
 * @author ZSAndroid
 * @create 2022-06-06-15:21
 */
public class SpringTest01 {

    /**
     * app1/applicationContext.xml下的id为“myStu”的Spring注入
     */
    @Test
    public void testStudentSpring() {
        //想从spring容器中取出对象,则要先创建容器对象,并启动才可以取对象.
        ApplicationContext ac = new ClassPathXmlApplicationContext("app1/applicationContext.xml");
        //取出学生对象
        Student stu = (Student) ac.getBean("myStu");
        System.out.println(stu);
    }

    /**
     * app2/applicationContext.xml下的id为“myBook”的Spring注入
     */
    @Test
    public void testBookSpring() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("app2/applicationContext.xml");
        //取出书对象
        Book book = (Book) ac.getBean("myBook");
        System.out.println(book);
    }

    /**
     * app2/applicationContext.xml下的id为“myStuAndBook”的Spring注入
     */
    @Test
    public void testStudentAndBookSpring() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("app2/applicationContext.xml");
        //取出学生和书对象
        StudentAndBook studentAndBook = (StudentAndBook) ac.getBean("myStuAndBook");
        System.out.println(studentAndBook);
    }
}
