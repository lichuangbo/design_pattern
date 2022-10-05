package cn.edu.tit.ChainOfResponsibility.analysis;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/8
 */
public interface IHandler {
    void handleMessage(IWomen women);
}
