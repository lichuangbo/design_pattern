package cn.edu.tit.decorator.implement;

/**
 * 装饰者模式：动态的给一个对象添加一些额外的职责，比生成子类方式更加灵活
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public class Father {
    public static void main(String[] args) {
        /**
         * 优点：
         *  装饰类和被装饰类解耦
         *  继承关系的一个替代方案，不管装饰多少层，实现的对象还是Component
         *  动态地扩展一个实现类功能
         * 缺点
         *  多层装饰比较复杂，实际开发中应尽量减少装饰类数量
         *
         * 场景：
         *  扩展类功能或增加附加功能
         *  动态的给对象增加功能
         *  为一批兄弟类进行改装或加装
         * Father、Son、GrandSon，先要修改Son类中的一些方法，但是增加的方法会对GrandSon产生影响，
         * 尤其当GrandSon有多个的时候，此时就可以建立SonDecorator来修饰Son
         */

        SchoolReport sr;
        sr = new FourthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);

        sr.report();
        sr.sign("张三");
    }
}
