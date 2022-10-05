package cn.edu.tit.observer;

import java.util.EventListener;
import java.util.Observable;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/5
 */
public class Client {

    public static void main(String[] args) {
        // 灰太狼--被观察者
        Wolf wolf = new Wolf();
        // 喜羊羊--观察者
        Observer pleasantSheep = new PleasantSheep();
        // 登记观察者
        wolf.attach(pleasantSheep);

        Observer lazySheep = new LazySheep();
        wolf.attach(lazySheep);

        // 灰太狼入侵
        wolf.invade();

        wolf.dettach(lazySheep);
        wolf.invade();

        // 观察者模式在JDK中的应用
//        java.util.Observer（JDK9弃用了）
//        Observable
//        EventListener(包下所有实现类)
    }

}

