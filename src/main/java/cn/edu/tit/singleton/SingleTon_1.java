package cn.edu.tit.singleton;

/**
 * 简单懒汉式    线程不安全
 * @author lichuangbo
 * @version 1.0
 * @created 2019/11/29
 */
public class SingleTon_1 {
    private static SingleTon_1 singleTon = null;

    private SingleTon_1() { }

    public static SingleTon_1 getInstance() {
        if (singleTon == null) {
            // 多个线程同时执行到这里，判断为null，都开始创建 ==> 违背了单例
            singleTon = new SingleTon_1();
        }
        return singleTon;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() +
                            "---" +SingleTon_1.getInstance());
                }
            }, "thread"+i).start();
        }
    }
}
