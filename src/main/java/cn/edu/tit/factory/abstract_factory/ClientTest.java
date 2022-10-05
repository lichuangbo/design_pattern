package cn.edu.tit.factory.abstract_factory;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/1
 */
public class ClientTest {
    public static void main(String[] args) {
        AbstractFactory mobileFactory = ConcreteFactory.getFactory("MobileFactory");
        Mobile huawei = mobileFactory.getMobile("HuaWei");
        huawei.tel();
        AbstractFactory computerFactory = ConcreteFactory.getFactory("ComputerFactory");
        Computer dell = computerFactory.getComputer("Dell");
        dell.playMusic();
    }
}
