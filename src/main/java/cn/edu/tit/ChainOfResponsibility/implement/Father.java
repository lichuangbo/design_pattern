package cn.edu.tit.ChainOfResponsibility.implement;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/8
 */
public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("\n------女儿向父亲请示------");

        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}
