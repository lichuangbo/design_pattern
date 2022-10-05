package cn.edu.tit.ChainOfResponsibility;

/**
 * 具体处理者 - 老板
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/6
 */
public class Boss extends Handler {
    public Boss() {
        super(2);
    }

    @Override
    public void report(Demand demand) {
        System.out.println("需求：" + demand.detail());
        System.out.println(getClass().getSimpleName() + "：你们打一架吧，打赢的做决定");
    }
}
