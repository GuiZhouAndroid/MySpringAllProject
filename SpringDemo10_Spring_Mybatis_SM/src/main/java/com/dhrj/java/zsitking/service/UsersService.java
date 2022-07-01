package com.dhrj.java.zsitking.service;

import com.dhrj.java.zsitking.entity.Users;

/**
 * @Created: by 2022-07-01 18:55
 * @Description: 用户业务接口
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public interface UsersService {
    //新增用户
    int insert(Users users);
}
