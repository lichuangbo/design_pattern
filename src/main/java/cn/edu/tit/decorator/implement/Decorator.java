package cn.edu.tit.decorator.implement;

/**
 * Decorator装饰角色： 实现接口或抽象方法，其中有一个private成员变量指向Component抽象构件
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    public void report() {
        this.sr.report();
    }

    public void sign(String name) {
        this.sr.sign(name);
    }
}
