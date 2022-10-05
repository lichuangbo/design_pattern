package cn.edu.tit.strategy.impl;

import cn.edu.tit.strategy.IStrategy;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public class BlockEnemy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
