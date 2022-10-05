package cn.edu.tit.factory.factory_method;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/1
 */
public class HuaWeiFactory implements MobileFactory {
    public Mobile createMobile() {
        return new HuaWei();
    }
}
