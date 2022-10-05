package cn.edu.tit.factory.abstract_factory;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/1
 */
public class ConcreteFactory {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType.equals("ComputerFactory")) {
            return new ComputerFactory();
        } else if (factoryType.equals("MobileFactory")) {
            return new MobileFactory();
        } else {
            return null;
        }
    }
}
