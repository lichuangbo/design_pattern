package cn.edu.tit.ChainOfResponsibility.implement;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/8
 */
public class Son extends Handler {

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("\n------母亲向儿子请示------");

        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
