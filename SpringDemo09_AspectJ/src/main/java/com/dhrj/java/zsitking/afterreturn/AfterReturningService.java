package com.dhrj.java.zsitking.afterreturn;

/**
 * @Created: by 2022-06-30 15:27
 * @Description: 后置通知业务接口
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public interface AfterReturningService {
    //我的名字
    String myName(String name);

    //我的年龄
    People myAge(int age);
}
