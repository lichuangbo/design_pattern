package cn.edu.tit.ChainOfResponsibility.implement;

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

        /**
         * Handler的子类可以继续扩展增加，只要在client中添加next链即可
         * 优点：将请求和处理分开，请求者不需要知道是谁处理的。处理者不需要知道请求的全貌
         * 缺点：随着处理者的增加，性能会下降，因为他从链头遍历到链尾；调式不方便，逻辑复杂
         */

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : arrayList) {
            father.handleMessage(women);
        }
    }
}
