package cn.edu.tit.proxy.staticProxy.nomal;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    // 构造函数传递要对谁进行代理
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
