package cn.edu.tit.ChainOfResponsibility;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/6
 */
public class DemandB implements Demand {

    public int demandLevel() {
        return 2;
    }

    public String detail() {
        return "加一张露一点点的图";
    }
}
