package com.dhrj.java.zsitking.pojo;

/**
 * created by on 2022/6/7
 * 描述：用户实体类
 *
 * @author ZSAndroid
 * @create 2022-06-07-14:15
 */
public class User {
    private int userId;
    private String userName;
    private int userAge;

    public User() {
    }

    public User(int userId, String userName, int userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
