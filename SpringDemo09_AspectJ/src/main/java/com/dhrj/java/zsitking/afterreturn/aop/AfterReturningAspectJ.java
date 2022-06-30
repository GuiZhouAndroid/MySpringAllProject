package com.dhrj.java.zsitking.afterreturn.aop;

import com.dhrj.java.zsitking.afterreturn.People;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Created: by 2022-06-30 15:35
 * @Description: 后置通知使用AspectJ实现AOP功能，此类为切面类,包含各种切面方法
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Aspect //交给AspectJ的框架去识别切面类
@Component //切面实例注册加载到spring容器中
public class AfterReturningAspectJ {

    /**
     * 后置通知的方法的规范
     * (1)访问权限是public
     * (2)方法没有返回值void
     * (3)方法名称自定义
     * (4)方法有参数(也可以没有参数,如果目标方法没有返回值,则可以写无参的方法,但一般会写有参,这样可以处理无参可以处理有参),这个切面方法的参数就是目标方法的返回值
     * (5)使用@AfterReturning注解表明是后置通知
     * 参数:
     * value:指定切入点表达式
     * returning:指定目标方法的返回值的名称,则名称必须与切面方法的参数名称一致.
     */
    @AfterReturning(value = "execution(* com.dhrj.java.zsitking.afterreturn.impl.AfterReturningServiceImpl.*(..))", returning = "obj")
    //切面方法的注解
    public void myAfterReturningAspectJ(Object obj) {
        System.out.println("AspectJ后置通知已执行...在AfterReturningServiceImpl执行之后才执行");
        if (obj != null) { //判断目标方法的返回值是否为空
            if (obj instanceof String) { //判断目标方法返回值的引用是否指向String类型
                System.out.println("AspectJ后置通知接收返回值是字符串:" + ((String) obj).toUpperCase());//全转为大写字母
            }
            if (obj instanceof People) { //判断目标方法返回值的引用是否指向People类型
                People people = (People) obj;
                people.setAge(100);
                System.out.println("AspectJ后置通知接收返回值是改变的People年龄:" + people.getAge());
            }
        }
    }
}
