package com.dhrj.java.zsitking.before;

/**
 * @Created: by 2022-06-30 10:15
 * @Description: 前置通知业务接口
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public interface BeforeService {
    //前置通知方法
    void beforeMethod();

    //我的信息
    String myInfo(String name, int age);
}
