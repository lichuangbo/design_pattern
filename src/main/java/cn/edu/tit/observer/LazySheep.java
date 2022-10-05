package cn.edu.tit.observer;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/5
 */
public class LazySheep implements Observer {

    public String getName() {
        return "懒羊羊";
    }

    public void update(String msg) {
        System.out.println("懒羊羊收到通知：" + msg);
    }

}

