package cn.edu.tit.singleton;

/**
 * 懒汉式 --- volatile+双重检查（Double Check Lock）
 * 线程安全
 * @author lichuangbo
 * @version 1.0
 * @created 2019/11/29
 */
public class SingleTon_DCL {
    private volatile static SingleTon_DCL singleTon;

    private SingleTon_DCL() {

    }

    public static SingleTon_DCL getInstance() {
        /*
         双重检查  但是存在指令重排，虽然发生几率小，但仍然是不安全的
         singleTon = new SingleTon_TCL();
         这一条语句JVM分为三步来实现：
            1. 给singleTon分配内存空间
            2. 调用构造方法对实例对象进行初始化
            3. 将实例对象引用指向分配的内存
            如果2,3指令重排，假如线程1刚执行完3，就被线程2抢占了锁，
            此时singleTon不为null（但是还没有初始化），会直接返回，自然会报错
          */
        if (singleTon == null) {
            synchronized (SingleTon_DCL.class) {
                if (singleTon == null) {
                    singleTon = new SingleTon_DCL();
                }
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
                            "---" +SingleTon_DCL.getInstance());
                }
            }, "thread"+i).start();
        }
    }
}
