package cn.edu.tit.singleton;

/**
 * 饿汉式 线程安全，在类加载时就创建好实例对象
 * @author lichuangbo
 * @version 1.0
 * @created 2019/11/29
 */
public class SingleTon {
    private static final SingleTon singleTon = new SingleTon();

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        return singleTon;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() +
                            "---" +SingleTon.getInstance());
                }
            }, "thread"+i).start();
        }

        // JDK中应用
        System.getSecurityManager();

        Runtime.getRuntime();
    }
}
