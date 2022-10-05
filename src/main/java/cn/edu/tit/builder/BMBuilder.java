package cn.edu.tit.builder;

import java.util.ArrayList;

/**
 * 具体建造者
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/4
 */
public class BMBuilder extends CarBuilder {
    private BMModel bm = new BMModel();

    // 将车的顺序传递给carModel
    public void setSequence(ArrayList<String> sequence) {
        this.bm.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.bm;
    }
}
