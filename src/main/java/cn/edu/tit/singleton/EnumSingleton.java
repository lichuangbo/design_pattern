package cn.edu.tit.singleton;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2021/4/11
 */
public class EnumSingleton {
    private EnumSingleton() {
        if(null != ContainerHolder.HOLDER.instance) {
            throw new RuntimeException("有了就不要創建了");
        }
    }

    public static EnumSingleton getInstance() {
        return ContainerHolder.HOLDER.instance;
    }

    private enum ContainerHolder {
        HOLDER;

        private EnumSingleton instance;

        ContainerHolder() {
            instance = new EnumSingleton();
        }
    }

    public static void main(String[] args) throws NoSuchMethodException,
            IllegalAccessException, InstantiationException, InvocationTargetException {
        System.out.println(EnumSingleton.getInstance());

        Class clazz = EnumSingleton.class;
        EnumSingleton enumSingleton = (EnumSingleton) clazz.newInstance();
//        System.out.println(enumSingleton);// 这样还是防不住反射攻击
        System.out.println(enumSingleton.getInstance());
//
//        Constructor declaredConstructor = clazz.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        EnumSingleton enumSingleton1 = (EnumSingleton) declaredConstructor.newInstance();
//        System.out.println(enumSingleton1.getInstance());// 只要调用的是getInstance()，那他就是唯一的
//
//        Class clazz2 = ContainerHolder.class;
//        Constructor declaredConstructor2 = clazz2.getDeclaredConstructor();
//        EnumSingleton enumSingleton2 = (EnumSingleton) declaredConstructor2.newInstance();
//        System.out.println(enumSingleton2);// NoSuchMethodException
    }
}
