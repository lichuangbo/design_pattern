package cn.edu.tit.ChainOfResponsibility.implement;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/8
 */
public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("\n------妻子向丈夫请示------");

        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
