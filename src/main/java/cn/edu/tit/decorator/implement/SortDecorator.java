package cn.edu.tit.decorator.implement;

/**
 * 具体装饰角色： 继承装饰角色
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
