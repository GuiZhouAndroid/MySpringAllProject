package com.dhrj.java.zsking.pojo;

/**
 * created by on 2022/6/6
 * 描述：学生实体类
 *
 * @author ZSAndroid
 * @create 2022-06-06-15:18
 */
public class Student {
    private String name;
    private int age;

    //交给Spring容器注入值,必须提供setXXX()方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        System.out.println("Spring创建学生对象的无参构造执行了...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
