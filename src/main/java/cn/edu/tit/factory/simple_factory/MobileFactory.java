package cn.edu.tit.factory.simple_factory;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/1
 */
public class MobileFactory {
    public static Mobile getPhone(String type) {
        if (type.equals("HuaWei")) {
            return new HuaWei();
        }else if (type.equals("OPPO")) {
            return new OPPO();
        }else {
            return null;
        }
    }
}
