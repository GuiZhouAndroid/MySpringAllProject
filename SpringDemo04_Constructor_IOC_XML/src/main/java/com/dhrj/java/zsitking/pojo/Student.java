package com.dhrj.java.zsitking.pojo;

/**
 * created by on 2022/6/7
 * 描述：学生实体类
 *
 * @author ZSAndroid
 * @create 2022-06-07-17:10
 */
public class Student {
    private String name;
    private int age;
    //引用类型School
    private School school;

    //不提供setter()方法，提供全参构造方法，给Spring给实例对象注入初始值
    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
