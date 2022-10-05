package cn.edu.tit.factory.factory_method;


import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Collection;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/1
 */
public class ClientTest {
    public static void main(String[] args) {
        //创建华为手机工厂，生产华为手机
        MobileFactory huaweiFactory = new HuaWeiFactory();
        Mobile huaWei = huaweiFactory.createMobile();
        //创建OPPO手机工厂，生产OPPO手机
        MobileFactory oppoFactory = new OPPOFactory();
        Mobile oppo = oppoFactory.createMobile();

        huaWei.tel();
        oppo.tel();

        // JDK中应用
        Logger logger = Logger.getLogger(ClientTest.class);

        Calendar instance = Calendar.getInstance();

        NumberFormat instance1 = NumberFormat.getInstance();
    }
}
