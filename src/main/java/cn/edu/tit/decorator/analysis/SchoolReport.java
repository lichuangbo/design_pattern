package cn.edu.tit.decorator.analysis;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public abstract class SchoolReport {
    // 看成绩单
    abstract void report();

    // 家长签名
    abstract void sign(String name);
}
