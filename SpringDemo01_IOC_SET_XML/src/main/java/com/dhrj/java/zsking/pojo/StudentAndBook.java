package com.dhrj.java.zsking.pojo;

/**
 * created by on 2022/6/6
 * 描述：学生实体注入书实体
 *
 * @author ZSAndroid
 * @create 2022-06-06-16:16
 */
public class StudentAndBook {
    private String name;//姓名
    private int age;//年龄
    //引用类型的成员变量
    private Book book;//学生的书

    public StudentAndBook() {
        System.out.println("学生的书无参构造方法执行了...");
    }

    //交给Spring容器注入值,必须提供setXXX()方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "StudentAndBook{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", book=" + book +
                '}';
    }
}
