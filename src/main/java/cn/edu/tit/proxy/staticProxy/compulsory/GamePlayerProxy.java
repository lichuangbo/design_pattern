package cn.edu.tit.proxy.staticProxy.compulsory;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

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

    // 代理的代理暂时没有，就是自己
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
