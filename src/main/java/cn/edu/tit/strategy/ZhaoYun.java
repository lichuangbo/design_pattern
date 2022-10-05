package cn.edu.tit.strategy;

import cn.edu.tit.strategy.impl.BackDoor;
import cn.edu.tit.strategy.impl.BlockEnemy;
import cn.edu.tit.strategy.impl.GiveGreenLight;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public class ZhaoYun {
    public static void main(String[] args) {
        /**
         * 优点：
         *  算法可以自由切换，通过封装角色对其进行封装，对外同意提供抽象封装角色
         *  避免使用多重条件判断
         *  扩展性好，增加策略十分容易，实现接口即可
         * 缺点：
         *  每个策略都是一个类，复用的可能性小，类数量多
         *  所有的策略类都需要对外暴露，必须知道有哪些策略，才可以决定使用         工厂方法或代理可以解决
         */
        Context context;
        System.out.println("----刚刚到吴国时拆第一个----");
        context = new Context(new BackDoor());
        context.operate();

        System.out.println("\n\n\n");
        System.out.println("----刘备乐不思蜀时拆第二个----");
        context = new Context(new GiveGreenLight());
        context.operate();

        System.out.println("\n\n\n");
        System.out.println("----孙权的小兵追来了，拆第三个----");
        context = new Context(new BlockEnemy());
        context.operate();


        // 可读性良好
        System.out.println(3 + "+" + 2 + "=" + Calculator.ADD.exec(3, 2));
    }
}
