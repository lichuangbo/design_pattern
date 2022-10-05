package cn.edu.tit.adapter;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/11
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 适配器模式：将一个类的接口变化成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类在一起工作
         *      只修改了一行代码，其他的业务逻辑不用修改，自动适配
         * 优点：
         *  增加了类的透明性：访问的是目标角色，具体实现委托给源角色
         *  提高类的复用度：源角色在原有系统中运转，在现有系统中加上适配器也可以运转
         *  灵活性好：可拆可卸
         * 缺点：
         *
         */
//        IUserInfo yongGirl = new UserInfo();
        IUserInfo yongGirl = new OuterUserInfo();
        for (int i = 0; i < 101; i++) {
            yongGirl.getMobileNumber();
        }
    }
}
