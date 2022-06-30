package com.dhrj.java.zsitking.before.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Created: by 2022-06-30 10:18
 * @Description: 前置通知使用AspectJ实现AOP功能，此类为切面类,包含各种切面方法
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Aspect //交给AspectJ的框架去识别切面类
@Component //切面实例注册加载到spring容器中
public class BeforeAspectJ {
    /**
     * 各种切面都在此类中进行开发
     * （1）访问修饰符权限是public
     * （2）方法的返回值是void
     * （3）方法名称是自定义
     * （4）可以没有方法形式参数，如果有，必为JoinPoint类型
     * （5）必须使用@Before注解来声明切入的时机是前切功能和切入点
     */

    /**
     * ...before.impl包下BeforeServiceImpl类中返回值是void类型并且公开的任意形参的任意方法都织入以下AOP功能
     */
    @Before(value = "execution(public void com.dhrj.java.zsitking.before.impl.BeforeServiceImpl.*(..))")//切入点表达式，此处为前置通知
    public void myBeforeMethod() {
        System.out.println("我是切面类中的AOP，前置通知呀~");
    }

    /**
     * ...before.impl包下任意类中返回值是String类型并且形参顺序为(String,int)公开的任意方法都织入以下AOP功能
     */
    @Before(value = "execution(public String com.dhrj.java.zsitking.before.impl.*.*(String,int))")//切入点表达式，此处为前置通知
    public void myInfoBefore() {
        System.out.println("我是切面类中的AOP，个人信息呀~");
    }

    /**
     * ...before.impl包下任意类中任意返回值类型并且公开的任意形参的任意方法都织入以下AOP功能
     */
    @Before(value = "execution(public * com.dhrj.java.zsitking.before.impl.*.*(..))")//切入点表达式，此处为前置通知
    public void myBeforeAll01() {
        System.out.println("我是切面类中的AOP，....before.impl包下任意公开类中任意方法的任意参数呀~");
    }

    /**
     * ...before本包及其子包中任意类下任意返回值类型并且任意形参的任意方法都织入以下AOP功能
     */
    @Before(value = "execution( * com.dhrj.java.zsitking.before..*.*(..))")//切入点表达式，此处为前置通知
    public void myBeforeAll02() {
        System.out.println("我是切面类中的AOP，....before包下以及多个子包下全部类中的方法呀~");
    }

    /**
     * 项目工程路径下全部中和方法都能都织入以下AOP功能——>不推荐使用，扫描效率极低，影响程序执行性能
     */
    @Before(value = "execution( * *(..))")//切入点表达式，此处为前置通知
    public void myBeforeAll03() {
        System.out.println("我是切面类中的AOP，....项目工程路径下全部中和方法呀~");
    }

    /**
     * ...before本包任意类下任意返回值类型并且任意形参的任意方法都织入以下AOP功能——>获取目标方法的签名和参数
     */
    @Before(value = "execution( * com.dhrj.java.zsitking.before.*.*(..))")
    public void myBeforeJoinPointArgs(JoinPoint jp) {
        System.out.println("目标方法的签名:" + jp.getSignature());
        System.out.println("目标方法的参数:" + Arrays.toString(jp.getArgs()));
    }
}
