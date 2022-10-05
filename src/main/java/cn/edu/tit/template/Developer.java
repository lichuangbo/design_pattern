package cn.edu.tit.template;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/5
 */
public class Developer extends Employee{
    protected void work() {
        System.out.println("写程序，处理需求");
    }

    @Override
    protected void comeToCompany() {
        System.out.println("骑着电动车来到公司");
    }

    @Override
    protected void leaveCompany() {
        System.out.println("骑着电动车回到家");
    }
}
