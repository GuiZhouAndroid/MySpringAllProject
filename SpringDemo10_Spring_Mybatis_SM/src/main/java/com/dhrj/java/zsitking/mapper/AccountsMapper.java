package com.dhrj.java.zsitking.mapper;

import com.dhrj.java.zsitking.entity.Accounts;
import com.dhrj.java.zsitking.entity.Users;

/**
 * @Created: by 2022-07-01 19:46
 * @Description:账户业务数据层访问接口
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public interface AccountsMapper {
    //新增账户
    int addAccounts(Accounts accounts);
}
