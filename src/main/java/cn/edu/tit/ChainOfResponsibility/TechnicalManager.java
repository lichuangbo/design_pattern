package cn.edu.tit.ChainOfResponsibility;

/**
 * 具体处理者 -- 技术经理
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/6
 */
public class TechnicalManager extends Handler {
    public TechnicalManager() {
        super(1);
    }

    @Override
    public void report(Demand demand) {
        System.out.println("需求：" + demand.detail());
        System.out.println(getClass().getSimpleName() + "：小猿我挺你，这个需求不干");
    }
}


