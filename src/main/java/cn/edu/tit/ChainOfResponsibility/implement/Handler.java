package cn.edu.tit.ChainOfResponsibility.implement;

/**
 * 抽象处理者
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/8
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    // 处理级别
    private int level = 0;
    // 责任传递，下一个更高的级别
    private Handler nextHandler;

    public Handler(int _level) {
        this.level = _level;
    }

    public final void handleMessage(IWomen women) {
        // 请求和级别相匹配，就处理该请求
        if (women.getType() == this.level) {
            this.response(women);
        } else {// 否则请求向后传递
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("-----没人可以请示了，自己做决定-----\n");
            }
        }
    }

    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    protected abstract void response(IWomen women);
}
