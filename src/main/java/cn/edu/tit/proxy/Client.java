package cn.edu.tit.proxy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public class Client {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 正常玩家 游戏过程
//        IGamePlayer player = new GamePlayer("张三");
//        System.out.println("开始时间：" + dateFormat.format(new Date()));
//
//        player.login("zhangsan", "password");
//
//        player.killBoss();
//
//        player.upgrade();
//
//        System.out.println("结束时间：" + dateFormat.format(new Date()));

        // 使用代理游戏公司 游戏过程
        IGamePlayer player = new GamePlayer("张三");// 被代理游戏玩家
        IGamePlayer proxy = new GamePlayerProxy(player); // 代理游戏玩家
        System.out.println("开始时间：" + dateFormat.format(new Date()));

        proxy.login("zhangsan", "password");

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("结束时间：" + dateFormat.format(new Date()));
    }
}
