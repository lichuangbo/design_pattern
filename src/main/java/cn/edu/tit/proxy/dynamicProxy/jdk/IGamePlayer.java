package cn.edu.tit.proxy.dynamicProxy.jdk;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public interface IGamePlayer {
    void login(String name, String password);

    void killBoss();

    void upgrade();
}
