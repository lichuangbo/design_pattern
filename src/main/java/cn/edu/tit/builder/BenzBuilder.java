package cn.edu.tit.builder;

import java.util.ArrayList;

/**
 * 具体建造者
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/4
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.benz;
    }
}
