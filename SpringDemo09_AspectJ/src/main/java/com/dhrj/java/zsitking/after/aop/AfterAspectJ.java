package com.dhrj.java.zsitking.after.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Created: by 2022-06-30 18:22
 * @Description:最终通知使用AspectJ实现AOP功能，此类为切面类,包含各种切面方法
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Aspect //交给AspectJ的框架去识别切面类
@Component //切面实例注册加载到spring容器中
public class AfterAspectJ {
    /**
     * 最终通知方法的规范
     * （1）访问权限是public
     * （2）方法没有返回值
     * （3）方法名称自定义
     * （4）方法没有参数,如果有也只能是JoinPoint
     * （5）使用@After注解表明是最终通知
     * 参数：value:指定切入点表达式
     */
    @After(value = "mycut()") //使用别名
    public void myAfter() {
        System.out.println("最终通知的功能...不论是否异常都会执行");
    }

    @Before(value = "mycut()") //使用别名
    public void myBefore() {
        System.out.println("前置通知的功能........");
    }

    @AfterReturning(value = "mycut()", returning = "obj") //使用别名
    public void myAfterReturning(Object obj) {
        System.out.println("后置通知的功能........");
    }

    @Around(value = "mycut()") //使用别名
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知中的前置通知的功能........");
        Object obj = pjp.proceed(pjp.getArgs());
        System.out.println("环绕通知中的后置通知的功能........");
        return obj;
    }

    /**
     * 为这个切入点表示"execution(* com.dhrj.java.zsitking.after.impl.AfterServiceImpl.*(..))"，取别名为“mycut”
     */
    @Pointcut(value = "execution(* com.dhrj.java.zsitking.after.impl.AfterServiceImpl.*(..))")
    public void mycut() {

    }
}
