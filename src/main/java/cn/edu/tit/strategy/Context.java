package cn.edu.tit.strategy;

/**
 * Context封装角色：屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
