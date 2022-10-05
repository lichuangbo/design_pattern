package cn.edu.tit.ChainOfResponsibility.analysis;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/8
 */
public class Son implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲的请示是：" + women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
