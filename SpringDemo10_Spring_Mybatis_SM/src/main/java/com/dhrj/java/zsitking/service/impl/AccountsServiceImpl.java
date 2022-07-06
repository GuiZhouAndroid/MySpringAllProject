package com.dhrj.java.zsitking.service.impl;

import com.dhrj.java.zsitking.entity.Accounts;
import com.dhrj.java.zsitking.mapper.AccountsMapper;
import com.dhrj.java.zsitking.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Created: by 2022-07-01 19:51
 * @Description:账户业务接口实现类
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
//@Transactional(propagation = Propagation.REQUIRED,//事务的传播特性(如果当前存在事务,就加入该事务,如果当前没有事务,就创建一个新的事务)
//        noRollbackForClassName = "ArithmeticException", //指定发生什么异常不回滚,使用的是异常的名称(发生ArithmeticException异常时不回滚)
//        noRollbackFor = ArithmeticException.class,//指定发生什么异常不回滚,使用的是异常的类型(发生ArithmeticException异常时不回滚)
//        rollbackForClassName = "",//指定发生什么异常必须回滚(发生ArithmeticException异常时回滚)
//        rollbackFor = ArithmeticException.class,//指定发生什么异常必须回滚(发生ArithmeticException异常时回滚)
//        timeout = -1, //连接超时设置,默认值是-1,表示永不超时
//        readOnly = false, //默认是false,如果是查询操作,必须设置为true.
//        isolation = Isolation.DEFAULT//使用数据库自已的隔离级别
//)//事务处于开启状态，生效
@Service //交给Spring去创建对象
public class AccountsServiceImpl implements AccountsService {

    //在所有的业务逻辑层中一定会有数据访问层的对象
    @Autowired
    private AccountsMapper accountsMapper;

    @Override
    public int addAccounts(Accounts accounts) {
        int num = 0;
        num = accountsMapper.addAccounts(accounts);
        System.out.println("增加帐户成功!");
        //手工抛出异常
        System.out.println(1 / 0);
        return num;
    }
}
