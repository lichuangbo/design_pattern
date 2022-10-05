package cn.edu.tit.proxy.staticProxy.compulsory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public class Client3 {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        IGamePlayer player = new GamePlayer("张三");
        // 使用它指定的代理对象访问，可以调用
        IGamePlayer proxy = player.getProxy();
        System.out.println("开始时间：" + dateFormat.format(new Date()));

        proxy.login("zhangsan", "password");

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("结束时间：" + dateFormat.format(new Date()));
    }
}
