package cn.edu.tit.proxy;

/**
 * 代理游戏对象
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public class GamePlayerProxy implements IGamePlayer {

    // 将被代理对象直接传入，这样的话，代理对象就可以直接操作被代理对象的方法了
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String name, String password) {
        this.gamePlayer.login(name, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
