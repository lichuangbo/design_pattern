package cn.edu.tit.strategy;

/**
 * 策略枚举
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public enum Calculator {
    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";
    private Calculator(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return this.value;
    }

    // 抽象方法在枚举中实现，每一个枚举成员就成为了一个具体策略
    public abstract int exec(int a, int b);
}
