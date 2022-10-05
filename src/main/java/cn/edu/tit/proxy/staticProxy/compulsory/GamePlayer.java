package cn.edu.tit.proxy.staticProxy.compulsory;


/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";
    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    // 真实角色指定了一个自己的代理，除了该代理谁都不能访问
    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + "又升了一级！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    // 指定自己的代理，别人在调用时，必须调用getProxy()
    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    // 是否为自己指定的代理在访问
    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
