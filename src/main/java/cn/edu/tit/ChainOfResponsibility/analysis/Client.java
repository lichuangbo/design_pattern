package cn.edu.tit.ChainOfResponsibility.analysis;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/8
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        /*
        职责不清    女儿的请求，应该在父亲类中做出决定，而不是client在组装关系
        代码臃肿    多个if-else，如果处理请示的人不止三种，会更多
        耦合过重    IHandler实现类继续扩展，client也要进行修改，违背开闭原则
        异常情况    妻子可以向丈夫请示，也可以像父亲请示
         */

        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for (IWomen women : arrayList) {
            if (women.getType() == 1) {
                System.out.println("\n------女儿向父亲请示------");
                father.handleMessage(women);
            } else if (women.getType() == 2) {
                System.out.println("\n------妻子向丈夫请示------");
                husband.handleMessage(women);
            } else if (women.getType() == 3){
                System.out.println("\n------母亲向儿子请示------");
                son.handleMessage(women);
            }
        }
    }
}
