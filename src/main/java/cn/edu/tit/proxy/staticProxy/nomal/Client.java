package cn.edu.tit.proxy.staticProxy.nomal;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 普通代理客户端
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public class Client {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 普通代理必须要知道代理的存在，也就是必须有GamePlayerProxy类存在
        // 同时客户端只能访问代理角色，不能访问真实角色
        // 这样，调用者只要知道代理存在就行，不用知道具体谁执行了代理操作
        IGamePlayer proxy = new GamePlayerProxy("张三");
        System.out.println("开始时间：" + dateFormat.format(new Date()));

        proxy.login("zhangsan", "password");

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("结束时间：" + dateFormat.format(new Date()));
    }
}
