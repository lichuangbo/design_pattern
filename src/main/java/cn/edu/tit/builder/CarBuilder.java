package cn.edu.tit.builder;

import java.util.ArrayList;

/**
 * 抽象建造者：要什么顺序直接告诉建造者，有建造者来创建
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/4
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
