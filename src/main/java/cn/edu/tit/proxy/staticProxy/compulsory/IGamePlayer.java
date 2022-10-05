package cn.edu.tit.proxy.staticProxy.compulsory;

/**
 * 强制代理：必须通过真实角色去找到代理角色，因为真实角色会去指定（他认可的）代理角色
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public interface IGamePlayer {
    void login(String name, String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();
}
