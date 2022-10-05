package cn.edu.tit.builder;

import java.util.ArrayList;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/4
 */
public class Client {
    public static void main(String[] args) {
        // 版本1：弊端：顺序无法随意调整，在client中必须每次都写设置场景顺序
//        BenzModel benz = new BenzModel();
//        ArrayList<String> sequence = new ArrayList<>();
//        sequence.add("engine boom");
//        sequence.add("alarm");
//        sequence.add("start");
//        sequence.add("stop");
//        benz.setSequence(sequence);
//        benz.run();

        // 版本2：
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("alarm");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();

        BMBuilder bmBuilder = new BMBuilder();
        bmBuilder.setSequence(sequence);
        BMModel bm = (BMModel) bmBuilder.getCarModel();

        benz.run();
        System.out.println();
        bm.run();

        // 版本3：添加导演类，里边有预设好的几种顺序
//        Director director = new Director();
//        BenzModel benzA = (BenzModel) director.getABenzModel();
//        benzA.run();
//        BenzModel benzB = (BenzModel) director.getBBenzModel();
//        benzB.run();
//        BMModel bmA = (BMModel) director.getABMModel();
//        bmA.run();
//        BMModel bmB = (BMModel) director.getBBMModel();
//        bmB.run();
    }
}
