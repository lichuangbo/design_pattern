package cn.edu.tit.proxy;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/27
 */
public class GamePlayer implements IGamePlayer {

    // name传递进类中，是为了后续代码this.name日志输出
    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级！");
    }
}
