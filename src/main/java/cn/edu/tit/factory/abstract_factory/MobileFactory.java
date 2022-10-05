package cn.edu.tit.factory.abstract_factory;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/1
 */
public class MobileFactory extends AbstractFactory {
    public Mobile getMobile(String mobile) {
        if (mobile.equals("HuaWei")) {
            return new HuaWei();
        } else if (mobile.equals("OPPO")) {
            return new OPPO();
        } else {
            return null;
        }
    }

    public Computer getComputer(String computer) {
        return null;
    }
}
