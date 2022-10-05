package cn.edu.tit.proxy.staticProxy.compulsory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public class Client2 {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 调用者创建代理去访问，不行。因为它指定了自己的代理角色
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);
        System.out.println("开始时间：" + dateFormat.format(new Date()));

        proxy.login("zhangsan", "password");

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("结束时间：" + dateFormat.format(new Date()));
    }
}
