package cn.edu.tit.singleton;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * 饿汉式  线程安全  利用类加载机制
 * 适用于 对静态字段使用线程安全的延迟化访问
 * @author lichuangbo
 * @version 1.0
 * @created 2019/11/29
 */
public class SingleTon_ClassLoader {
    // 类在初始化阶段会获取初始化锁，而多个线程尝试对类进行初始化时，必须去竞争这把锁
    // 获得锁的线程才能对类进行初始化，虽然创建对象语句仍然存在指令重排，但是对其他线程是不可见的
    private static class SingleTonHolder{
        private static SingleTon_ClassLoader instance = new SingleTon_ClassLoader();
    }

    // 抛异常，阻止反射创建对象
    private SingleTon_ClassLoader() {
        if(null != SingleTonHolder.instance) {
            throw new RuntimeException("有了就不要創建了");
        }
    }

    public static SingleTon_ClassLoader getInstance() {
        return SingleTonHolder.instance;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() +
                            "---" +SingleTon_ClassLoader.getInstance());
                }
            }, "thread"+i).start();
        }

        Class clazz = SingleTon_ClassLoader.class;
        SingleTon_ClassLoader o = (SingleTon_ClassLoader)clazz.newInstance();
        System.out.println(o);
    }
}
