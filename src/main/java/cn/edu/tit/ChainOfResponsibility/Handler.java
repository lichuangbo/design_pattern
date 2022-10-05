package cn.edu.tit.ChainOfResponsibility;

/**
 * 抽象处理者
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/6
 */
public abstract class Handler {
    private Handler nextHandler;
    private int level;

    public Handler(int level) {
        this.level = level;
    }

    // 处理请求传递，注意final，子类不可重写
    public final void handleMessage(Demand demand) {
        if (level == demand.demandLevel()) {
            this.report(demand);
        } else {
            if (this.nextHandler != null) {
                System.out.println("事情太严重，需报告上一级");
                this.nextHandler.handleMessage(demand);
            } else {
                System.out.println("我就是boss，没有上头");
            }
        }
    }

    // 设置下一个处理者
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    // 抽象方法，子类实现
    public abstract void report(Demand demand);
}
