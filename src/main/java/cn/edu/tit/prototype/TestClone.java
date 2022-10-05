package cn.edu.tit.prototype;

import java.util.ArrayList;

/**
 * 深拷贝和浅拷贝
 * Object类提供的clone方法，只拷贝本对象，其对象内部的数组、引用对象都不拷贝，还指向原地址
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/6
 */
public class TestClone {

    public static void main(String[] args) {
        ThingLow thingLow = new ThingLow();
        thingLow.setValue("张三");

        ThingLow cloneThingLow = thingLow.clone();
        cloneThingLow.setValue("李四");
        System.out.println(thingLow.getValue());


        ThingHigh thingHigh = new ThingHigh();
        thingHigh.setValue("张三");

        ThingHigh cloneThingHigh = thingHigh.clone();
        cloneThingHigh.setValue("李四");
        System.out.println(thingHigh.getValue());
    }

    static class ThingLow implements Cloneable {
        private ArrayList<String> arrayList = new ArrayList<>();

        @Override
        protected ThingLow clone() {
            ThingLow thingLow = null;
            try {
                thingLow = (ThingLow) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return thingLow;
        }

        public ArrayList<String> getValue() {
            return this.arrayList;
        }

        public void setValue(String value) {
            this.arrayList.add(value);
        }
    }

    static class ThingHigh implements Cloneable {
        private ArrayList<String> arrayList = new ArrayList<>();

        @Override
        protected ThingHigh clone() {
            ThingHigh thingHigh = null;
            try {
                thingHigh = (ThingHigh) super.clone();
                // 成员引用类型属性也clone
                thingHigh.arrayList = (ArrayList<String>) this.arrayList.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return thingHigh;
        }

        public ArrayList<String> getValue() {
            return this.arrayList;
        }

        public void setValue(String value) {
            this.arrayList.add(value);
        }
    }
}