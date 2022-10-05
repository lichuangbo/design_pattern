package cn.edu.tit.proxy;

/**
 * 代理游戏对象
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public class GamePlayerProxy implements IGamePlayer {

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
