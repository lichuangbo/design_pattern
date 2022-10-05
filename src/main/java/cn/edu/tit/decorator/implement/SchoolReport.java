package cn.edu.tit.decorator.implement;

/**
 * Component抽象构件：表示最原始的对象
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public abstract class SchoolReport {
    // 看成绩单
    abstract void report();

    // 签名
    abstract void sign(String name);
}
