package cn.edu.tit.ChainOfResponsibility;

/**
 *  请求
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/6
 */
public interface Demand {

    int demandLevel();

    String detail();
}
