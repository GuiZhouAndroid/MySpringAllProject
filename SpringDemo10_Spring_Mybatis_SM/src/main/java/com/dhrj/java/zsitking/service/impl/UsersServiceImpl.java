package com.dhrj.java.zsitking.service.impl;

import com.dhrj.java.zsitking.entity.Users;
import com.dhrj.java.zsitking.mapper.UsersMapper;
import com.dhrj.java.zsitking.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Created: by 2022-07-01 18:59
 * @Description:用户业务接口实现类
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Service //交给Spring去创建对象
public class UsersServiceImpl implements UsersService {
    /**
     * 《在所有的业务逻辑层中一定会有数据访问层的对象》
     * 一、Mybatis容器原生方式获取数据访问层的对象（不推荐，此方式比较low，代码没有复用，开发效率低。）
     *  1.读取核心配置文件
     *  InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
     *  2.创建工厂对象
     *  SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
     *  3.取出sqlSession
     *  sqlSession = factory.openSession(true);//自动提交事务
     *  4.取出动态代理的对象,完成接口中方法的调用,实则是调用xml文件中相的标签的功能
     *  uMapper = sqlSession.getMapper(UsersMapper.class);
     *
     * 二、Spring框架IOC控制反转方式获取数据访问层的对象（推荐，此方式比较高，代码复用，开发效率高。）
     * 1.利用Spring注解的方式，将数据访问层对象注入（创建单例对象）到Spring的Beans工厂中
     * 2.此时Spring框架在内存中创建了一个UsersMapper接口实现类型对象，并且将其存储到了IOC容器中，这个对象就是我们所需要的对象
     * 3.使用@Autowired按类型将UsersMapper接口实现类型对象注入到业务逻辑层的对象中
     *  -若在此条件下单例模式是默认的（scope="singleton"），使用@Autowired@Resources自动查找引用数据访问层的对象都行
     *  -如果是多例模式(scope="prototype")，则需要使用@Autowired+@Qualifier或@Resources自动查找数据访问层的对象
     * 4.这样业务逻辑层就可以通过接口实现类型对象直接调用数据访问层的业务方法了
     * 注意：重要条件————>业务逻辑层必须标注@Service交给Spring去创建对象，如1、2同理，将对象注入到IOC容器中，提供给控制层Controller使用
     *
     * 三、以上一和二的区别：
     *  A.共同点：都是使用JDK动态代理，CGLib代理需另配置细节参数(根据目标对象没有实现接口，采用子类CGLib代理即可)。
     *  B.不同点：方式一：使用IO流+控制正转创建SqlSession对象，方式二：使用基于注解的Spring控制反转。
     */
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int addUsers(Users users) {
        return usersMapper.addUsers(users);
    }
}
