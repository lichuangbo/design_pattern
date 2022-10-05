package cn.edu.tit.strategy;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
