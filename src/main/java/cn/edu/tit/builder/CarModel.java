package cn.edu.tit.builder;

import java.util.ArrayList;

/**
 * 抽象产品类
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/4
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")){
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}
