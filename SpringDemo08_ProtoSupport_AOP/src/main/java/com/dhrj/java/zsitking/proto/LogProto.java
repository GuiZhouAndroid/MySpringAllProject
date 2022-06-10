package com.dhrj.java.zsitking.proto;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * created by on 2022/6/10
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-06-10-11:45
 */
public class LogProto implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("\n[系统日志]" + sf.format(new Date()) + "---" + method.getName() + Arrays.toString(objects));
    }
}
