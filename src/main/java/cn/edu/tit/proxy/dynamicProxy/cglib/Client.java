package cn.edu.tit.proxy.dynamicProxy.cglib;


import net.sf.cglib.proxy.Enhancer;

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
        // 被代理游戏玩家
        GamePlayer player = new GamePlayer("张三");
        // 代理游戏玩家
        GamePlayer proxy = (GamePlayer) Enhancer.create(player.getClass(), new GamePlayerEH(player));

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("开始时间：" + dateFormat.format(new Date()));

        proxy.login("zhangsan", "password");

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("结束时间：" + dateFormat.format(new Date()));
    }
}
