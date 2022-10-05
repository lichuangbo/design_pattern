package cn.edu.tit.observer;

/**
 * 具体被观察者--灰太狼
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/5
 */
public class Wolf extends Subject {

    public void invade(){
        System.out.println("灰太狼：我要搞事情了");
        // 通知所有观察者
        notifyObserver();
    }

}

