package cn.edu.tit.strategy;

/**
 * ConcreteStrategy: 具体策略角色，包含具体的策略或算法
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public class GiveGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行");
    }
}
