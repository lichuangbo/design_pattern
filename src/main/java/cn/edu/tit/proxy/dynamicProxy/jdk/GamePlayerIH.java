package cn.edu.tit.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类: 根据被代理的接口生成所有的方法
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/28
 */
public class GamePlayerIH implements InvocationHandler {
    // 被代理的实例
    Object obj;

    // 代理谁
    public GamePlayerIH(Object obj) {
        this.obj = obj;
    }

    // 通过invocationHandler接口，所有的方法都由该Handler来进行处理
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在使用你的账号登录游戏！");
        }
        return result;
    }
}
