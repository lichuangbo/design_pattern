package cn.edu.tit.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象被观察者
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/5
 */
public abstract class Subject {

    /**
     * 观察者对象的集合
     */
    private List<Observer> observerList = new ArrayList<Observer>();

    /**
     * 登记观察者
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observerList.add(observer);
        System.out.println("增加了观察者：" + observer.getName());
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void dettach(Observer observer) {
        observerList.remove(observer);
        System.out.println("删除了观察者：" + observer.getName());
    }

    /**
     * 通知所有观察者
     */
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update("灰太狼要搞事情了");
        }
    }

}
