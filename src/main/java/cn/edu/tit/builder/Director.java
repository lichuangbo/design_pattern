package cn.edu.tit.builder;

import java.util.ArrayList;

/**
 * 导演类，按照不同的顺序去组装不同车型
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/4
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();

    private CarBuilder benzBuilder = new BenzBuilder();

    private CarBuilder bmBuilder = new BMBuilder();

    public CarModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return this.benzBuilder.getCarModel();
    }

    public CarModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return this.benzBuilder.getCarModel();
    }

    public CarModel getABMModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmBuilder.setSequence(sequence);
        return this.bmBuilder.getCarModel();
    }

    public CarModel getBBMModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmBuilder.setSequence(sequence);
        return this.bmBuilder.getCarModel();
    }
}
