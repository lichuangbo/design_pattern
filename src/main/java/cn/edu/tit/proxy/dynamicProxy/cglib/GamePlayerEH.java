package cn.edu.tit.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/28
 */
public class GamePlayerEH implements MethodInterceptor {
    // 被代理对象
    Object obj;

    // 代理谁
    public GamePlayerEH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = method.invoke(this.obj, objects);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在使用你的账号登录游戏！");
        }
        return result;
    }
}
