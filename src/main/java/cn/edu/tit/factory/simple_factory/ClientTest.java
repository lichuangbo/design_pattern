package cn.edu.tit.factory.simple_factory;

import javax.crypto.KeyGenerator;
import java.text.DateFormat;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/1
 */
public class ClientTest {
    public static void main(String[] args) {
        //给定手机类型，创建该类型手机
        Mobile m1 = MobileFactory.getPhone("OPPO");
        Mobile m2 = MobileFactory.getPhone("HuaWei");

        m1.tel();
        m2.tel();
    }
}
