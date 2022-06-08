package com.dhrj.java.zsitking.byautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * created by on 2022/6/8
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-06-08-15:26
 */
@Component("myStudent")
public class Student {
    @Value("张松")
    private String name;
    @Value("24")
    private int age;

    //引用类型注入，注解声明顺序不计
    @Autowired //引用类型按类型注入
    @Qualifier("mySchool") //引用类型按名称注入，必须搭配@Autowired才能完成引用类型的注入
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}

