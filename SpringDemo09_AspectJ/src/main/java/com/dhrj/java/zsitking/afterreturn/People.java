package com.dhrj.java.zsitking.afterreturn;

/**
 * @Created: by 2022-06-30 15:53
 * @Description: 人类
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public class People {
    //年龄
    private int age;

    public People() {
    }

    public People(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                ", age=" + age +
                '}';
    }
}
