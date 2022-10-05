package cn.edu.tit.observer;

/**
 * 具体观察者-喜羊羊
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/5
 */
public class PleasantSheep implements Observer{

    public String getName() {
        return "喜羊羊";
    }

    /**
     * 具体业务逻辑
     */
    public void update(String msg) {
        System.out.println("喜羊羊收到通知：" + msg);
    }

}

