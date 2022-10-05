package cn.edu.tit.observer;

/**
 * 抽象观察者
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/5
 */
public interface Observer {

    String getName();

    /**
     * 通知更新方法
     *
     * @param msg
     */
    void update(String msg);

}

