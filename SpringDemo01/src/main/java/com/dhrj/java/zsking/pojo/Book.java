package com.dhrj.java.zsking.pojo;

/**
 * created by on 2022/6/6
 * 描述：书实体
 *
 * @author ZSAndroid
 * @create 2022-06-06-16:08
 */
public class Book {
    private String bookName;
    private int bookPrice;

    public Book() {
        System.out.println("Spring创建书对象的无参构造执行了......");
    }

    //交给Spring容器注入值,必须提供setXXX()方法
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
