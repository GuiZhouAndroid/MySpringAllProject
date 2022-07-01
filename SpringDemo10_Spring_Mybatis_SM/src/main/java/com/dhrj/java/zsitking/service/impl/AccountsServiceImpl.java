package com.dhrj.java.zsitking.service.impl;

import com.dhrj.java.zsitking.entity.Accounts;
import com.dhrj.java.zsitking.mapper.AccountsMapper;
import com.dhrj.java.zsitking.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Created: by 2022-07-01 19:51
 * @Description:账户业务接口实现类
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Service //交给Spring去创建对象
public class AccountsServiceImpl implements AccountsService {

    //在所有的业务逻辑层中一定会有数据访问层的对象
    @Autowired
    private AccountsMapper accountsMapper;

    @Override
    public int addAccounts(Accounts accounts) {
        int num = 0;
        num = accountsMapper.addAccounts(accounts);
//        System.out.println("增加帐户成功!num=" + num);
//        //手工抛出异常
//        System.out.println(1 / 0);
        return num;
    }
}
