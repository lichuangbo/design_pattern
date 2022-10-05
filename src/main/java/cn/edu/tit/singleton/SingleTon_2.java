package cn.edu.tit.singleton;

/**
 * 懒汉式探索
 * @author lichuangbo
 * @version 1.0
 * @created 2019/11/29
 */
public class SingleTon_2 {
    private static SingleTon_2 singleTon = null;

    private SingleTon_2() { }

    public static SingleTon_2 getInstance() {
        /*if (singleTon == null) {
            // 不行的，多个线程同时到达，没加之前是同时在new对象，现在是一个个new对象，本质上没有改变
            synchronized (SingleTon_2.class) {
                singleTon = new SingleTon_2();
            }
        }*/

        // 线程安全，但是一进方法就要同步，效率不高 ==> 理想是仅在创建对象时同步
        synchronized (SingleTon_2.class) {
            if (singleTon == null) {
                singleTon = new SingleTon_2();
            }
        }
        return singleTon;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() +
                            "---" +SingleTon_2.getInstance());
                }
            }, "thread"+i).start();
        }
    }
}
