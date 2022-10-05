package cn.edu.tit.builder;

/**
 * 具体产品类奔驰
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/4
 */
public class BenzModel extends CarModel {
    protected void start() {
        System.out.println("奔驰车是这样启动的。。。");
    }

    protected void stop() {
        System.out.println("奔驰车是这样停车的。。。");
    }

    protected void alarm() {
        System.out.println("奔驰车的喇叭声是这样的。。。");
    }

    protected void engineBoom() {
        System.out.println("奔驰车的引擎声是这样的。。。");
    }
}
