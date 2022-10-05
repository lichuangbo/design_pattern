package cn.edu.tit.proxy.dynamicProxy.jdk;

import java.lang.reflect.Proxy;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/28
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");// 被代理游戏玩家
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(// 代理游戏玩家
                player.getClass().getClassLoader(),
                player.getClass().getInterfaces(),// 被代理对象的所有接口方法
                new GamePlayerIH(player));// 接管所有接口方法

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("开始时间：" + dateFormat.format(new Date()));

        proxy.login("zhangsan", "password");

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("结束时间：" + dateFormat.format(new Date()));
    }
}
