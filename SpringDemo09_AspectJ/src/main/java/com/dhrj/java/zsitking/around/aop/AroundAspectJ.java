package com.dhrj.java.zsitking.around.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Created: by 2022-06-30 17:31
 * @Description:
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Aspect //交给AspectJ的框架去识别切面类
@Component //切面实例注册加载到spring容器中
public class AroundAspectJ {
    /**
     * 环绕通知方法的规范
     * （1）访问权限是public
     * （2）切面方法有返回值,此返回值就是目标方法的返回值
     * （3）方法名称自定义
     * （4）方法有参数,此参数就是目标方法
     * （5）回避异常Throwable
     * （6）使用@Around注解声明是环绕通知
     * 参数:
     * value:指定切入点表达式
     */

    @Around(value = "execution(* com.dhrj.java.zsitking.around.impl.*.*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        //1.前切功能实现
        System.out.println("环绕通知中的前置功能实现...");
        //2.目标方法调用——>重点调用
        Object obj = pjp.proceed(pjp.getArgs());//返回值obj即为目标方法的返回值，参数是目标方法的参数（有参数或无参数都不影响）
        //3.后切功能实现
        System.out.println("环绕通知中的后置功能实现...");
        return obj.toString() + "，环绕通知已修改此返回值";   //拦截目标方法并改变了目标方法的返回值
    }
}
