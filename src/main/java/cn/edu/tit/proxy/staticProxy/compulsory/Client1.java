package cn.edu.tit.proxy.staticProxy.compulsory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public class Client1 {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 只能通过代理访问，此时访问无效
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间：" + dateFormat.format(new Date()));

        player.login("zhangsan", "password");

        player.killBoss();

        player.upgrade();

        System.out.println("结束时间：" + dateFormat.format(new Date()));
    }
}
